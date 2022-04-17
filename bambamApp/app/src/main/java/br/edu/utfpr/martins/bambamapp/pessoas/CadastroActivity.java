package br.edu.utfpr.martins.bambamapp.pessoas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import br.edu.utfpr.martins.bambamapp.PrincipalActivity;
import br.edu.utfpr.martins.bambamapp.R;

public class CadastroActivity extends AppCompatActivity {

    private EditText editTextNome, editTextCell;
    private CheckBox cbMonday, cbTuesday, cbWednesday, cbThursday, cbFriday, cbSaturday;
    private RadioGroup radioGroupGender;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startEditText();
        startSpinner();
        startRadioGroupGender();
        popularCheckbox();

    }

    private void startEditText(){
        editTextNome = findViewById(R.id.inputName);
        editTextCell = findViewById(R.id.inputCell);
    }

    private void startRadioGroupGender(){
        radioGroupGender = findViewById(R.id.radioGroupGender);
    }

    private void startSpinner(){
        spinner = (Spinner) findViewById(R.id.training_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.training_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void popularCheckbox(){
        cbMonday = findViewById(R.id.checkBoxMonday);
        cbTuesday = findViewById(R.id.checkBoxTuesday);
        cbWednesday = findViewById(R.id.checkBoxWednesday);
        cbThursday = findViewById(R.id.checkBoxThursday);
        cbFriday = findViewById(R.id.checkBoxFriday);
        cbSaturday = findViewById(R.id.checkBoxSaturday);
    }

    private String getTextEditName(){
        String name = editTextNome.getText().toString();
        boolean verify = validateTextEdit(name);

        if(!verify){
            editTextNome.requestFocus();
            Toast.makeText(this, R.string.name_clean, Toast.LENGTH_SHORT).show();
        }

        return name;
    }

    private String getTextEditCellNumber(){
        String cellNumber = editTextCell.getText().toString();
        boolean verify = validateTextEdit(cellNumber);
        if(!verify){
            editTextCell.requestFocus();
            Toast.makeText(this, R.string.cell_clean, Toast.LENGTH_SHORT).show();
        }

        return cellNumber;
    }

    private String getRadioGroupGender(){
        String typeGender = "";

        switch (radioGroupGender.getCheckedRadioButtonId()){
            case R.id.radioButtonFamale:
                typeGender = "Feminino";
                break;

            case R.id.radioButtonMale:
                typeGender = "Masculino";
                break;
        }

        boolean verify = validateTextEdit(typeGender);

        if(!verify){
            radioGroupGender.requestFocus();
            Toast.makeText(this, R.string.gender_clean, Toast.LENGTH_SHORT).show();
        }

        return typeGender;
    }

    private ArrayList<String> getCheckbox(){

        ArrayList<String> checkBox = new ArrayList<>();

        if(!cbMonday.isChecked() && !cbTuesday.isChecked() && !cbWednesday.isChecked()&&
                !cbThursday.isChecked() && !cbFriday.isChecked() && !cbSaturday.isChecked()){
            Toast.makeText(this, R.string.checkbox_clean, Toast.LENGTH_SHORT).show();
        }
        if(cbMonday.isChecked()){checkBox.add(getString(R.string.monday));}
        if(cbTuesday.isChecked()){checkBox.add(getString(R.string.tuesday));}
        if(cbWednesday.isChecked()){checkBox.add(getString(R.string.wednesday));}
        if(cbThursday.isChecked()){checkBox.add(getString(R.string.thursday));}
        if(cbFriday.isChecked()){checkBox.add(getString(R.string.friday));}
        if(cbSaturday.isChecked()){checkBox.add(getString(R.string.saturday));}

        return checkBox;

    }

    private String getSpinner(){
        String training = (String) spinner.getSelectedItem();

        if (training.equals(getString(R.string.training_spinner))){
            Toast.makeText(this, R.string.select_training, Toast.LENGTH_SHORT).show();
            training = "";
        }

        return training;
    }

    private void clearEditText(){
        editTextCell.setText(null);
        editTextNome.setText(null);
        editTextNome.requestFocus();
    }

    private void clearAllCheckBox(){
        cbMonday.setChecked(false);
        cbTuesday.setChecked(false);
        cbWednesday.setChecked(false);
        cbThursday.setChecked(false);
        cbFriday.setChecked(false);
        cbSaturday.setChecked(false);
    }

    private void clearRadioGroupGender(){
        radioGroupGender.clearCheck();
    }

    public void clearAllItems(View view){
        clearAllCheckBox();
        clearRadioGroupGender();
        clearEditText();

        Toast.makeText(this, R.string.clear_message, Toast.LENGTH_SHORT).show();
    }

    public void saveItems(View view){
        String cell = getTextEditCellNumber();
        String name = getTextEditName();
        String gender = getRadioGroupGender();
        ArrayList<String> checkBox = getCheckbox();
        String activity = getSpinner();

        if(!name.isEmpty() && !cell.isEmpty() && !gender.isEmpty() && !checkBox.isEmpty()
                && !activity.equals("")){

            Intent intent = new Intent(this, PrincipalActivity.class);

            Pessoa pessoa = new Pessoa(name, cell, checkBox, gender, activity);

            intent.putExtra("person", pessoa);

            startActivity(intent);
        }
    }

    private boolean validateTextEdit(String string){
        return !string.isEmpty();
    }

}