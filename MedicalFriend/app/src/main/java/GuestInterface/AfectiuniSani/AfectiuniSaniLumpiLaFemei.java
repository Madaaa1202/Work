package GuestInterface.AfectiuniSani;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.medicalfriend.R;

public class AfectiuniSaniLumpiLaFemei extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_sani_lumpi_la_femei);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneSani2);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneSani2);

        if(textView.getText().toString().equals("Brustklumpen bei Frauen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Breast lumps in women"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Bosses mammaires chez les femmes"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Lumpuri de sân la femei"))
        {

            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniRo, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
    }
    private class function implements AdapterView.OnItemSelectedListener {
        @SuppressLint("ResourceType")
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            //eng
            if (parent.getItemAtPosition(position).toString().equals("The GP overview")) {
                textView2.setText("");
                textView2.setText("The discovery of a lump in a woman’s breast will usually create a lot of anxiety. She will probably have found it herself and with the high public awareness of breast cancer, will want reassurance or rapid action. A careful examination of both breasts and associated lymph nodes is mandatory.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " carcinoma\n" +
                        " cyst\n" +
                        " abscess\n" +
                        " fi broadenoma\n" +
                        " fi brous dysplasia\n" +
                        "OCCASIONAL\n" +
                        " duct ectasia\n" +
                        " fat necrosis\n" +
                        " lipoma\n" +
                        " Paget’s disease of the nipple\n" +
                        " galactocoele\n" +
                        " multiple cysts\n" +
                        "RARE\n" +
                        " tuberculosis\n" +
                        " sarcoma\n" +
                        " lymphoma\n" +
                        " phyllodes tumour (benign)\n" +
                        " Mondor’s disease (thrombophlebitis) ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("There are few investigations worth doing in general practice other than attempted aspiration of a suspected cyst.\n" +
                        "Specialist investigation may include aspiration, mammography, ultrasound (for example, to distinguish a solid from a cystic lump), biopsy and, when appropriate, cancer staging. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" If the lump feels cystic, consider aspiration – instant resolution of the problem will result in a very grateful patient. But warn the patient that unsuccessful aspiration, while requiring referral, does not necessarily imply a sinister diagnosis – some cysts can be very diffi cult to aspirate.\n" +
                        " Check the breast again a couple of weeks aft er aspiration. As long as the lump has completely resolved and the aspirate was not bloodstained, no further action is required.\n" +
                        " It is quite common for women to think they can feel a lump while the doctor has diffi culty in detecting a discrete lesion. Re-examine aft er the patient’s next period – but then make a firm management decision. If in doubt, refer rather than delay further as the woman will\n" +
                        "understandably be very anxious.\n" +
                        " In the very elderly, breast carcinoma may run a relatively benign course, responding very well to tamoxifen alone. In certain cases it might be worth discussing the situation with your local specialist, as GP treatment will provoke far less anxiety. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Skin dimpling, local flattening of the breast and nipple alteration indicate cancer until proved otherwise.\n" +
                        " Even if the diagnosis is likely to be a fi broadenoma – as in a young woman with a highly mobile lump – refer, as unpleasant surprises do occur.\n" +
                        " In a post-menopausal woman, the diagnosis is almost certain to be carcinoma. Refer urgently.\n" +
                        " A mass appearing aft er trauma may be fat necrosis – but recheck aft er a few weeks and refer if not resolved. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Die Entdeckung eines Klumpens in der Brust einer Frau führt normalerweise zu viel Angst. Sie wird es wahrscheinlich selbst gefunden haben und mit dem hohen öffentlichen Bewusstsein für Brustkrebs werden beruhigt oder schnell handeln. Eine sorgfältige Untersuchung beider Brüste und assoziierter Lymphknoten ist obligatorisch.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Karzinom\n" +
                        "  Zyste\n" +
                        "  Abszess\n" +
                        "  fi Broadenom\n" +
                        "  fibröse Dysplasie\n" +
                        "GELEGENTLICH\n" +
                        "  Duktus-Ektasie\n" +
                        "  Fettnekrose\n" +
                        "  Lipom\n" +
                        "  Morbus Paget der Brustwarze\n" +
                        "  Galaktozele\n" +
                        "  mehrere Zysten\n" +
                        "SELTEN\n" +
                        "  Tuberkulose\n" +
                        "  Sarkom\n" +
                        "  Lymphom\n" +
                        "  Phyllodes-Tumor (gutartig)\n" +
                        "  Mondor-Krankheit (Thrombophlebitis)");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("In der Allgemeinpraxis gibt es nur wenige Untersuchungen, die sich lohnen, außer der versuchten Aspiration einer vermuteten Zyste.\n" +
                        "Die fachärztliche Untersuchung kann Aspiration, Mammographie, Ultraschall (z. B. zur Unterscheidung eines soliden von einem zystischen Knoten), Biopsie und gegebenenfalls Krebs-Staging umfassen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Wenn sich der Knoten zystisch anfühlt, ziehen Sie eine Aspiration in Betracht – eine sofortige Lösung des Problems wird zu einem sehr dankbaren Patienten führen. Aber warnen Sie den Patienten, dass eine erfolglose Aspiration zwar eine Überweisung erfordert, aber nicht unbedingt eine düstere Diagnose impliziert – einige Zysten können sehr schwierig zu aspirieren sein.\n" +
                        " Überprüfen Sie die Brust einige Wochen nach der Punktion erneut. Solange sich der Klumpen vollständig aufgelöst hat und das Aspirat nicht blutig war, sind keine weiteren Maßnahmen erforderlich.\n" +
                        " Es ist durchaus üblich, dass Frauen glauben, sie könnten einen Knoten spüren, während der Arzt Schwierigkeiten hat, eine diskrete Läsion zu erkennen. Untersuchen Sie die Patientin nach der nächsten Periode erneut – aber treffen Sie dann eine feste Managemententscheidung. Wenden Sie sich im Zweifelsfall lieber weiter, als weiter zu verzögern, wie es die Frau will\n" +
                        "verständlicherweise sehr besorgt.\n" +
                        " Bei sehr alten Menschen kann das Mammakarzinom einen relativ gutartigen Verlauf nehmen und spricht sehr gut auf Tamoxifen allein an. In bestimmten Fällen kann es sich lohnen, die Situation mit Ihrem Facharzt zu besprechen, da eine Hausarztbehandlung weitaus weniger Angst hervorruft.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Dellen in der Haut, lokale Abflachung der Brust und Brustwarzenveränderungen weisen auf Krebs hin, bis das Gegenteil bewiesen ist.\n" +
                        "  Auch wenn sich die Diagnose wahrscheinlich auf ein Fi-Broadenom – wie bei einer jungen Frau mit einem hochmobilen Knoten – beziehen dürfte, so kommt es doch zu unangenehmen Überraschungen.\n" +
                        "  Bei einer postmenopausalen Frau ist die Diagnose mit ziemlicher Sicherheit ein Karzinom. Dringend nachschlagen.\n" +
                        "  Eine Masse, die nach einem Trauma auftritt, kann eine Fettnekrose sein – aber überprüfen Sie sie nach ein paar Wochen erneut und überweisen Sie sie, wenn sie nicht behoben ist.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("La découverte d'une bosse dans le sein d'une femme créera généralement beaucoup d'anxiété. Elle l'aura probablement trouvé elle-même et avec la sensibilisation du public élevée au cancer du sein, voudra rassurer ou une action rapide. Un examen attentif des poitrines et des ganglions lymphatiques associés est obligatoire.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  carcinome\n" +
                        "  kyste\n" +
                        "  abcès\n" +
                        "  fi largeénome\n" +
                        "  dysplasie fibreuse\n" +
                        "OCCASIONNEL\n" +
                        "  ectasie canalaire\n" +
                        "  nécrose graisseuse\n" +
                        "  lipome\n" +
                        "  Maladie de Paget du mamelon\n" +
                        "  galactocèle\n" +
                        "  plusieurs kystes\n" +
                        "RARE\n" +
                        "  tuberculose\n" +
                        "  sarcome\n" +
                        "  lymphome\n" +
                        "  tumeur phyllode (bénigne)\n" +
                        "  Maladie de Mondor (thrombophlébite)");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("Il y a peu d'investigations dignes d'être faites en médecine générale autres que la tentative d'aspiration d'un kyste suspecté.\n" +
                        "L'investigation spécialisée peut comprendre l'aspiration, la mammographie, l'échographie (par exemple, pour distinguer un solide d'une masse kystique), la biopsie et, le cas échéant, la stadification du cancer.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Si la masse semble kystique, envisagez l'aspiration - la résolution instantanée du problème se traduira par un patient très reconnaissant. Mais avertissez le patient qu'une aspiration infructueuse, bien qu'elle nécessite une référence, n'implique pas nécessairement un diagnostic sinistre - certains kystes peuvent être très difficiles à aspirer.\n" +
                        " Vérifiez à nouveau le sein quelques semaines après l'aspiration. Tant que la masse a complètement disparu et que l'aspiration n'était pas tachée de sang, aucune autre action n'est requise.\n" +
                        " Il est assez fréquent que les femmes pensent qu'elles peuvent sentir une grosseur alors que le médecin a du mal à détecter une lésion discrète. Réexaminez après les prochaines règles de la patiente, mais prenez ensuite une décision de gestion ferme. En cas de doute, référez-vous plutôt que de retarder davantage car la femme\n" +
                        "naturellement être très anxieux.\n" +
                        " Chez les personnes très âgées, le carcinome du sein peut suivre une évolution relativement bénigne, répondant très bien au tamoxifène seul. Dans certains cas, il peut être utile de discuter de la situation avec votre spécialiste local, car le traitement par un médecin généraliste provoquera beaucoup moins d'anxiété.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Les capitons cutanés, l'aplatissement local du sein et l'altération du mamelon indiquent un cancer jusqu'à preuve du contraire.\n" +
                        "  Même si le diagnostic est susceptible d'être un fibrome élargi - comme chez une jeune femme avec une grosseur très mobile - référez-vous, car des surprises désagréables se produisent.\n" +
                        "  Chez une femme post-ménopausée, le diagnostic est presque certain d'être un carcinome. Référez-vous d'urgence.\n" +
                        "  Une masse apparaissant après un traumatisme peut être une nécrose graisseuse - mais revérifier après quelques semaines et référer si elle n'est pas résolue.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Descoperirea unei forțe în sânul unei femei va crea de obicei multă anxietate. Probabil că a găsit -o singură și, cu conștientizarea înaltă a publicului despre cancerul de sân, va dori reasigurare sau acțiune rapidă. O examinare atentă a sânilor și a ganglionilor limfatici asociați este obligatorie.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  carcinom\n" +
                        "  chist\n" +
                        "  abces\n" +
                        "  fi largidenomul\n" +
                        "  displazie fi broasa\n" +
                        "OCAZIONAL\n" +
                        "  ectazie de canal\n" +
                        "  necroza grasă\n" +
                        "  lipom\n" +
                        "  boala Paget a mamelonului\n" +
                        "  galactocoele\n" +
                        "  chisturi multiple\n" +
                        "RAR\n" +
                        "  tuberculoză\n" +
                        "  sarcom\n" +
                        "  limfom\n" +
                        "  tumoare phyllodes (benignă)\n" +
                        "  boala Mondor (tromboflebită)");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Există puține investigații care merită făcute în practica generală, în afară de încercarea de aspirație a unui chist suspectat.\n" +
                        "Investigația de specialitate poate include aspirație, mamografie, ecografie (de exemplu, pentru a distinge un solid de un nodul chistic), biopsie și, atunci când este cazul, stadializarea cancerului.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Dacă nodul se simte chistic, luați în considerare aspirația - rezolvarea instantanee a problemei va duce la un pacient foarte recunoscător. Dar avertizați pacientul că aspirația nereușită, deși necesită trimitere, nu implică neapărat un diagnostic sinistru – unele chisturi pot fi foarte greu de aspirat.\n" +
                        " Verificați din nou sânul la câteva săptămâni după aspirație. Atâta timp cât nodul s-a rezolvat complet și aspiratul nu a fost pătat de sânge, nu este necesară nicio acțiune suplimentară.\n" +
                        " Este destul de comun ca femeile să creadă că pot simți un nodul în timp ce medicul are dificultăți în a detecta o leziune discretă. Reexaminați după următoarea menstruație a pacientului - dar apoi luați o decizie fermă de management. Dacă aveți îndoieli, referiți-vă mai degrabă decât amânați mai mult, așa cum va face femeia\n" +
                        "de înțeles să fii foarte anxioasă.\n" +
                        " La persoanele foarte în vârstă, carcinomul mamar poate avea un curs relativ benign, răspunzând foarte bine numai la tamoxifen. În anumite cazuri, ar putea merita să discutați situația cu specialistul local, deoarece tratamentul medicului de familie va provoca mult mai puțină anxietate.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Gropitele pielii, aplatizarea locală a sânului și alterarea mameloanelor indică cancer până când se dovedește contrariul.\n" +
                        "  Chiar dacă diagnosticul este probabil să fie un adenom fi - ca la o femeie tânără cu un nodul foarte mobil - referiți-vă, deoarece apar surprize neplăcute.\n" +
                        "  La o femeie în postmenopauză, diagnosticul este aproape sigur a fi carcinom. Consultați urgent.\n" +
                        "  O masă care apare după un traumatism poate fi necroză adipoasă – dar verificați din nou după câteva săptămâni și consultați dacă nu este rezolvată.");
            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    public class function2 implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}