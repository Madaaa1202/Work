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

public class AfectiuniSaniDurereDeSan extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_sani_durere_de_san);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneSani3);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneSani3);

        if(textView.getText().toString().equals("Brustvergrößerung bei Männern")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Breast enlargement in men"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Élargissement du sein chez les hommes"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Mărirea sânilor la bărbați"))
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
                textView2.setText("Breast pain have a variety of innocent causes: the commonest are puberty and pregnancy. It can be a troublesome recurrent problem for women with cyclical mastalgia. Cancer is very likely to be a major concern: this is an uncommon cause and pain is an unfortunately late sign of the disease. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " pregnancy\n" +
                        " cyclical mastalgia\n" +
                        " cracked or infl amed nipple\n" +
                        " breast abscess\n" +
                        " mastitis\n" +
                        "OCCASIONAL\n" +
                        " carcinoma\n" +
                        " onset of puberty\n" +
                        " lactation and/or galactocoele\n" +
                        " simple cyst\n" +
                        " trauma\n" +
                        "RARE\n" +
                        " chondritis of costal cartilage\n" +
                        " angina\n" +
                        " cervical spondylosis\n" +
                        " herpes zoster\n" +
                        " Mondor’s disease (thrombophlebitis of chest wall or breast veins – rare: 0.5–0.9%)\n" +
                        " tuberculosis ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none.\n" +
                        "POSSIBLE: pregnancy test, fi ne needle aspiration, mammography.\n" +
                        "SMALL PRINT: swab of any nipple discharge, other investigations if non-breast causes suspected.\n" +
                        " Pregnancy test worthwhile in bilateral pain if a period has been missed.\n" +
                        " Fine needle aspiration of a tense cyst may yield fl uid for cytology and relieve the pain. If only blood is obtained, refer urgently.\n" +
                        " Mammography may help if pain is accompanied by a mass or ill-defi ned nodularity but this would normally be performed in secondary care aft er referral.\n" +
                        " If the aetiology is infective and the nipple is discharging, a swab may help guide treatment.\n" +
                        " Other investigations: if a non-breast cause is suspected, other tests may be required according to the pattern of the symptoms, e.g. stress test (angina) or cervical spine X-ray (cervical spondylosis).");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Offer to examine the breasts even if you are sure from the history that there is no signifi cant pathology – many women fear breast cancer and will fi nd your reassurance hard to accept if they feel they haven’t been taken seriously.\n" +
                        " Don’t refl exly prescribe in cyclical mastalgia; the patient’s agenda is often to exclude serious disease rather than seek drug therapy.\n" +
                        " Remember pregnancy as a cause – the patient will not always volunteer this as a possibility, even if she has just missed a period.\n" +
                        " Unilateral breast pain with no other local signs may be an early symptom of shingles. Check the back in the T4/5 dermatomes for a rash. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" ‘Chest pain’ may be a euphemism used by a (frequently older) woman in denial. Don’t miss advanced tumour through not examining the breasts.\n" +
                        " Cancer rarely presents with breast pain but consider this possibility in a woman complaining of constant ‘pricking’ breast pain.\n" +
                        " A lactating woman with unilateral breast pain and fl u-type symptoms is probably developing mastitis – treat early to avoid the development of an abscess.\n" +
                        " If the pain is related to exertion in a late middle-aged or elderly woman, consider angina as a possibility. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Brustschmerzen haben eine Vielzahl harmloser Ursachen: Die häufigsten sind Pubertät und Schwangerschaft. Es kann ein lästiges wiederkehrendes Problem für Frauen mit zyklischer Mastalgie sein. Krebs ist sehr wahrscheinlich ein großes Problem: Dies ist eine seltene Ursache und Schmerzen sind leider ein spätes Anzeichen der Krankheit.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Schwangerschaft\n" +
                        "  zyklische Mastalgie\n" +
                        "  rissige oder entzündete Brustwarze\n" +
                        "  Brustabszess\n" +
                        "  Mastitis\n" +
                        "GELEGENTLICH\n" +
                        "  Karzinom\n" +
                        "  Beginn der Pubertät\n" +
                        "  Laktation und/oder Galactocoele\n" +
                        "  einfache Zyste\n" +
                        "  Trauma\n" +
                        "SELTEN\n" +
                        "  Chondritis des Rippenknorpels\n" +
                        "  Angina\n" +
                        "  zervikale Spondylose\n" +
                        "  Herpes zoster\n" +
                        "  Morbus Mondor (Thrombophlebitis der Brustwand oder Brustvenen – selten: 0,5–0,9 %)\n" +
                        "  Tuberkulose");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine.\n" +
                        "MÖGLICH: Schwangerschaftstest, Feinnadelaspiration, Mammographie.\n" +
                        "KLEINDRUCK: Abstrich von Brustwarzenausfluss, andere Untersuchungen bei Verdacht auf Ursachen außerhalb der Brust.\n" +
                        "  Schwangerschaftstest lohnt sich bei beidseitigen Schmerzen, wenn die Periode ausgeblieben ist.\n" +
                        "  Die Feinnadelaspiration einer angespannten Zyste kann Flüssigkeit für die Zytologie liefern und die Schmerzen lindern. Wenn nur Blut entnommen wird, dringend überweisen.\n" +
                        "  Eine Mammographie kann hilfreich sein, wenn der Schmerz von einer Masse oder einer schlecht definierten Knötchenbildung begleitet wird, aber dies würde normalerweise nach Überweisung in der Sekundärversorgung durchgeführt werden.\n" +
                        "  Wenn die Ätiologie infektiös ist und die Brustwarze sezerniert, kann ein Abstrich helfen, die Behandlung zu steuern.\n" +
                        "  Weitere Untersuchungen: Bei Verdacht auf eine nicht brusterzeugende Ursache können je nach Symptombild weitere Untersuchungen erforderlich sein, z. Stresstest (Angina pectoris) oder Röntgen der Halswirbelsäule (zervikale Spondylose).");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Bieten Sie an, die Brüste zu untersuchen, auch wenn Sie sich aus der Anamnese sicher sind, dass keine signifikante Pathologie vorliegt – viele Frauen haben Angst vor Brustkrebs und werden Ihre Beruhigung nur schwer akzeptieren können, wenn sie sich nicht ernst genommen fühlen.\n" +
                        "  Verschreiben Sie nicht reflektorisch bei zyklischer Mastalgie; Die Agenda des Patienten besteht oft darin, eine schwere Krankheit auszuschließen, anstatt eine medikamentöse Therapie zu suchen.\n" +
                        "  Denken Sie an eine Schwangerschaft als Ursache – die Patientin wird dies nicht immer als Möglichkeit angeben, selbst wenn sie gerade ihre Periode verpasst hat.\n" +
                        "  Einseitige Brustschmerzen ohne andere lokale Anzeichen können ein frühes Symptom einer Gürtelrose sein. Überprüfen Sie den Rücken in den T4/5-Dermatomen auf einen Ausschlag.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("„Brustschmerzen“ kann ein Euphemismus sein, der von einer (häufig älteren) Frau in Verleugnung verwendet wird. Verpassen Sie keinen fortgeschrittenen Tumor, indem Sie die Brüste nicht untersuchen.\n" +
                        "  Krebs tritt selten mit Brustschmerzen auf, aber erwägen Sie diese Möglichkeit bei einer Frau, die über ständige „stechende“ Brustschmerzen klagt.\n" +
                        "  Eine stillende Frau mit einseitigen Brustschmerzen und grippeähnlichen Symptomen entwickelt wahrscheinlich eine Mastitis – behandeln Sie sie frühzeitig, um die Entwicklung eines Abszesses zu vermeiden.\n" +
                        "  Wenn der Schmerz bei einer Frau im späten mittleren Alter oder bei älteren Frauen mit Anstrengung zusammenhängt, ziehen Sie eine Angina pectoris in Betracht.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Les douleurs mammaires ont diverses causes innocentes : les plus courantes sont la puberté et la grossesse. Il peut s'agir d'un problème récurrent gênant pour les femmes souffrant de mastalgie cyclique. Le cancer est très susceptible d'être une préoccupation majeure : c'est une cause peu fréquente et la douleur est un signe malheureusement tardif de la maladie.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  grossesse\n" +
                        "  mastalgie cyclique\n" +
                        "  mamelon fissuré ou enflammé\n" +
                        "  abcès du sein\n" +
                        "  mastite\n" +
                        "OCCASIONNEL\n" +
                        "  carcinome\n" +
                        "  début de la puberté\n" +
                        "  lactation et/ou galactocèle\n" +
                        "  simple kyste\n" +
                        "  traumatisme\n" +
                        "RARE\n" +
                        "  chondrite du cartilage costal\n" +
                        "  angine\n" +
                        "  arthrose cervicale\n" +
                        "  zona\n" +
                        "  Maladie de Mondor (thrombophlébite de la paroi thoracique ou des veines mammaires - rare : 0,5 à 0,9 %)\n" +
                        "  tuberculose");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun.\n" +
                        "POSSIBLE : test de grossesse, ponction à l'aiguille fine, mammographie.\n" +
                        "PETITS CARACTÈRES : écouvillonnage de tout écoulement du mamelon, autres investigations si des causes non mammaires sont suspectées.\n" +
                        "  Test de grossesse utile dans les douleurs bilatérales en cas d'absence de règles.\n" +
                        "  L'aspiration à l'aiguille fine d'un kyste tendu peut produire du liquide pour la cytologie et soulager la douleur. Si vous n'obtenez que du sang, transférez-le d'urgence.\n" +
                        "  La mammographie peut être utile si la douleur s'accompagne d'une masse ou d'une nodularité mal définie, mais elle doit normalement être réalisée en soins secondaires après référence.\n" +
                        "  Si l'étiologie est infectieuse et que le mamelon s'écoule, un écouvillonnage peut aider à guider le traitement.\n" +
                        "  Autres investigations : si une cause non mammaire est suspectée, d'autres tests peuvent être nécessaires en fonction du schéma des symptômes, par ex. épreuve d'effort (angine de poitrine) ou radiographie du rachis cervical (arthrose cervicale).");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Proposez d'examiner les seins même si vous êtes sûre, d'après l'anamnèse, qu'il n'y a pas de pathologie significative - de nombreuses femmes craignent le cancer du sein et auront du mal à accepter votre réconfort si elles estiment qu'elles n'ont pas été prises au sérieux.\n" +
                        "  Ne pas prescrire par réflexe dans les mastalgies cycliques ; le programme du patient est souvent d'exclure une maladie grave plutôt que de rechercher un traitement médicamenteux.\n" +
                        "  Rappelez-vous que la grossesse est une cause – la patiente ne le proposera pas toujours comme une possibilité, même si elle vient de manquer ses règles.\n" +
                        "  Une douleur mammaire unilatérale sans autres signes locaux peut être un symptôme précoce du zona. Vérifiez le dos dans les dermatomes T4/5 pour une éruption cutanée.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La «douleur thoracique» peut être un euphémisme utilisé par une femme (souvent plus âgée) dans le déni. Ne manquez pas la tumeur avancée en n'examinant pas les seins.\n" +
                        "  Le cancer se présente rarement avec des douleurs mammaires, mais considérez cette possibilité chez une femme se plaignant de douleurs mammaires constantes.\n" +
                        "  Une femme qui allaite avec des douleurs mammaires unilatérales et des symptômes de type grippal développe probablement une mammite – traitez-la tôt pour éviter le développement d'un abcès.\n" +
                        "  Si la douleur est liée à l'effort chez une femme d'âge moyen ou âgée, envisagez une angine de poitrine comme une possibilité.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Durerea de sân are o varietate de cauze inocente: cele mai frecvente sunt pubertatea și sarcina. Poate fi o problemă recurentă supărătoare pentru femeile cu mastalgie ciclică. Este foarte probabil ca cancerul să fie o preocupare majoră: aceasta este o cauză neobișnuită, iar durerea este, din păcate, un semn tardiv al bolii.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  sarcina\n" +
                        "  mastalgie ciclică\n" +
                        "  mamelon crapat sau inflamat\n" +
                        "  abces mamar\n" +
                        "  mastită\n" +
                        "OCAZIONAL\n" +
                        "  carcinom\n" +
                        "  debutul pubertăţii\n" +
                        "  lactaţie şi/sau galactocele\n" +
                        "  chist simplu\n" +
                        "  trauma\n" +
                        "RAR\n" +
                        "  condrita cartilajului costal\n" +
                        "  angină pectorală\n" +
                        "  spondiloza cervicala\n" +
                        "  herpes zoster\n" +
                        "  Boala Mondor (tromboflebită a peretelui toracic sau a venelor mamare – rare: 0,5–0,9%)\n" +
                        "  tuberculoză");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul.\n" +
                        "POSIBIL: test de sarcină, aspirație cu ac fin, mamografie.\n" +
                        "SCRIU MICI: tamponarea oricărei scurgeri din mamelon, alte investigații dacă se suspectează cauze non-sân.\n" +
                        "  Test de sarcină merită în cazul durerilor bilaterale dacă a fost omisă o perioadă.\n" +
                        "  Aspirația cu ac fin a unui chist tensionat poate produce lichid pentru citologie și poate ameliora durerea. Dacă se obține doar sânge, trimiteți urgent.\n" +
                        "  Mamografia poate ajuta dacă durerea este însoțită de o masă sau de nodularitate nedefinită, dar aceasta ar fi efectuată în mod normal în îngrijirea secundară după trimitere.\n" +
                        "  Dacă etiologia este infecțioasă și mamelonul se scurge, un tampon poate ajuta la ghidarea tratamentului.\n" +
                        "  Alte investigații: dacă se suspectează o cauză non-sân, pot fi necesare alte teste în funcție de tiparul simptomelor, de ex. test de stres (angina pectorală) sau radiografia coloanei cervicale (spondiloză cervicală).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Oferiți-vă să examinați sânii chiar dacă din istorie sunteți sigur că nu există o patologie semnificativă – multe femei se tem de cancerul de sân și vor fi greu de acceptat siguranța dumneavoastră dacă simt că nu au fost luate în serios.\n" +
                        "  Nu prescrieți în mod expres în mastalgia ciclică; agenda pacientului este adesea să excludă boala gravă, mai degrabă decât să caute terapie medicamentoasă.\n" +
                        "  Amintiți-vă sarcina ca o cauză – pacienta nu va oferi întotdeauna acest lucru ca o posibilitate, chiar dacă tocmai a pierdut o perioadă.\n" +
                        "  Durerea unilaterală a sânilor fără alte semne locale poate fi un simptom precoce al zona zoster. Verificați spatele dermatomilor T4/5 pentru o erupție cutanată.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("„Durere în piept” poate fi un eufemism folosit de o femeie (deseori mai în vârstă) în negare. Nu ratați tumora avansată prin neexaminarea sânilor.\n" +
                        "  Rareori, cancerul se manifestă cu dureri de sân, dar luați în considerare această posibilitate la o femeie care se plânge de dureri de sâni „înțepate” constante.\n" +
                        "  O femeie care alăptează cu durere unilaterală a sânilor și simptome de tip gripal dezvoltă probabil mastită – tratați-vă devreme pentru a evita dezvoltarea unui abces.\n" +
                        "  Dacă durerea este legată de efort la o femeie de vârstă mijlocie sau în vârstă, luați în considerare angina ca o posibilitate.");
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