package GuestInterface.AfectiuniAbdomen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.medicalfriend.R;

public class AfectiuniAbdomenPainInPregnancy extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_pain_in_pregnancy);
        overridePendingTransition(0, 0);
        textView = (TextView) findViewById(R.id.TextViewDenumireAfectiune3);
        spinner = (Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2 = (TextView) findViewById(R.id.TextViewInformatiiAfectiune3);
        if(textView.getText().toString().equals("Schmerzen in der schwangerschaft")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Pain in pregnancy"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Douleur pendant la grossesse"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Durere de sarcină"))
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
                textView2.setText("A pregnant woman who develops this symptom is very likely to be extremely concerned that there is a threat to her pregnancy. Anxiety levels may therefore be high in the patient and her partner. Acknowledge this emotional distress by an urgent and full assessment. Listed here are causes specific to pregnancy and conditions which may be exacerbated or altered by pregnancy; ‘run of the mill’ causes (such as gastroenteritis, IBS and dyspepsia) may obviously occur too, but rarely create diagnostic problems and so are not considered in this section.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " symphysis pubis and ligament strain\n" +
                        " miscarriage: 20–40% of pregnancies in fi rst trimester\n" +
                        " labour: 6% premature\n" +
                        " placental abruption: 1/80–200 pregnancies\n" +
                        " pyelonephritis (especially around 20 weeks)\n" +
                        "OCCASIONAL\n" +
                        " constipation (common cause but only occasionally presents)\n" +
                        " ectopic pregnancy (1/250 pregnancies)\n" +
                        " appendicitis (1/1000 pregnancies)\n" +
                        " red degeneration of fi broid\n" +
                        " torsion/rupture of ovarian cyst or tumour\n" +
                        "RARE\n" +
                        " uterine rupture (in UK 1/1500 pregnancies, of which 70% due to Caesarian scar\n" +
                        "dehiscence)\n" +
                        " uterine torsion (axial rotation >90°): 90% associated with fi broids, adnexal masses and\n" +
                        "anatomical uterine anomalies\n" +
                        " liver congestion due to pre-eclampsia\n" +
                        " rectus sheath haematoma ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("These will be dictated by the clinical urgency of the situation. In severe pain, they will be done in secondary care.\n" +
                        "LIKELY: urinalysis, MSU.\n" +
                        "POSSIBLE: ultrasound, FBC.\n" +
                        "SMALL PRINT: laparoscopy.\n" +
                        " Urinalysis: proteinuria in pre-eclampsia. Blood, pus cells and nitrite in urinary tract infection (UTI); the infecting organism will be confi rmed on MSU.\n" +
                        " FBC: raised WCC in UTI.\n" +
                        " Imaging ultrasound can be diagnostic in abruption and miscarriage; the presence of an intrauterine pregnancy makes an ectopic very unlikely; ultrasound may also be helpful in detecting a rectus sheath haematoma.\n" +
                        " Laparoscopy: to confi rm ectopic pregnancy");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Pain on standing and walking, and relieved by rest, with exquisite pubic symphysis tenderness, is ‘symphyseal pain’ – an oft en overlooked cause.\n" +
                        " Allay understandable anxieties as appropriate – particularly regarding the well-being of the foetus or the possibility of premature labour.\n" +
                        " Do not be too ready to diagnose UTI on the basis of an abnormal urinalysis – contamination in pregnancy is common.");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Distortion of anatomy may alter symptoms and signs: appendicitis is notoriously diffi cult to diagnose in the second trimester. If in doubt, admit.\n" +
                        " A woman in early pregnancy who experiences unilateral lower abdominal pain followed by light bleeding or blackish discharge has an ectopic until proved otherwise.\n" +
                        " Don’t overlook the diagnosis of premature labour. Women with no previous experience of labour pain might not consider this possibility.\n" +
                        " Placental abruption causes severe, continuous pain with a tender, hard uterus. Vaginal bleeding may be minimal. Admit immediately.\n" +
                        " Don’t forget pre-eclampsia as a cause of epigastric pain in the third trimester: check the blood pressure (BP) and urine. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Eine schwangere Frau, die dieses Symptom entwickelt, ist sehr wahrscheinlich sehr besorgt, dass ihre Schwangerschaft gefährdet ist. Das Angstniveau kann daher bei der Patientin und ihrem Partner hoch sein. Erkennen Sie diese emotionale Belastung durch eine dringende und vollständige Bewertung an. Hier sind schwangerschaftsspezifische Ursachen und Erkrankungen aufgeführt, die durch eine Schwangerschaft verschlimmert oder verändert werden können; Alltägliche Ursachen (wie Gastroenteritis, Reizdarmsyndrom und Dyspepsie) können natürlich auch auftreten, führen aber selten zu diagnostischen Problemen und werden daher in diesem Abschnitt nicht berücksichtigt.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Schambeinfuge und Bandzerrung\n" +
                        "  Fehlgeburt: 20–40 % der Schwangerschaften im ersten Trimester\n" +
                        "  Wehen: 6 % vorzeitig\n" +
                        "  Plazentalösung: 1/80–200 Schwangerschaften\n" +
                        "  Pyelonephritis (insbesondere um die 20. Woche)\n" +
                        "GELEGENTLICH\n" +
                        "  Verstopfung (häufige Ursache, aber nur gelegentlich vorhanden)\n" +
                        "  Eileiterschwangerschaft (1/250 Schwangerschaften)\n" +
                        "  Blinddarmentzündung (1/1000 Schwangerschaften)\n" +
                        "  rote Degeneration von Myomen\n" +
                        "  Torsion/Ruptur einer Ovarialzyste oder eines Tumors\n" +
                        "SELTEN\n" +
                        "  Uterusruptur (in Großbritannien 1/1500 Schwangerschaften, davon 70 % aufgrund einer Kaiserschnittnarbe\n" +
                        "Dehiszenz)\n" +
                        "  Uterustorsion (axiale Rotation >90°): 90 % verbunden mit Myomen, Adnexmassen und\n" +
                        "anatomische Gebärmutteranomalien\n" +
                        "  Leberstauung aufgrund von Präeklampsie\n" +
                        "  Hämatom der Rektusscheide");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("Diese werden von der klinischen Dringlichkeit der Situation bestimmt. Bei starken Schmerzen werden sie in der Sekundärversorgung durchgeführt.\n" +
                        "WAHRSCHEINLICH: Urinanalyse, MSU.\n" +
                        "MÖGLICH: Ultraschall, FBC.\n" +
                        "KLEINDRUCK: Laparoskopie.\n" +
                        "  Urinanalyse: Proteinurie bei Präeklampsie. Blut, Eiterzellen und Nitrit bei Harnwegsinfektionen (UTI); der infizierende Organismus wird auf MSU bestätigt.\n" +
                        "  FBC: erhöhte WCC in UTI.\n" +
                        "  Bildgebender Ultraschall kann bei Abbruch und Fehlgeburt diagnostisch sein; das Vorliegen einer intrauterinen Schwangerschaft macht eine Eileiterschwangerschaft sehr unwahrscheinlich; Ultraschall kann auch hilfreich sein, um ein Hämatom der Rektusscheide zu erkennen.\n" +
                        "  Laparoskopie: zur Bestätigung einer Eileiterschwangerschaft");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Schmerzen beim Stehen und Gehen, die durch Ruhe gelindert werden, mit exquisiter Schmerzempfindlichkeit der Schambeinfuge, ist „Symphysenschmerz“ – eine oft übersehene Ursache.\n" +
                        "  Zerstreuen Sie gegebenenfalls verständliche Ängste – insbesondere in Bezug auf das Wohlergehen des Fötus oder die Möglichkeit vorzeitiger Wehen.\n" +
                        "  Seien Sie nicht zu schnell bereit, eine Harnwegsinfektion auf der Grundlage einer abnormalen Urinanalyse zu diagnostizieren – eine Kontamination in der Schwangerschaft ist weit verbreitet.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Eine Verzerrung der Anatomie kann Symptome und Anzeichen verändern: Appendizitis ist im zweiten Trimester notorisch schwer zu diagnostizieren. Im Zweifelsfall zugeben.\n" +
                        "  Eine Frau in der Frühschwangerschaft, die einseitige Unterleibsschmerzen, gefolgt von leichten Blutungen oder schwärzlichem Ausfluss, hat, bis das Gegenteil bewiesen ist.\n" +
                        "  Übersehen Sie nicht die Diagnose vorzeitiger Wehen. Frauen ohne vorherige Erfahrung mit Wehenschmerzen ziehen diese Möglichkeit möglicherweise nicht in Betracht.\n" +
                        "  Eine Plazentalösung verursacht starke, anhaltende Schmerzen mit einem empfindlichen, harten Uterus. Vaginale Blutungen können minimal sein. Sofort zugeben.\n" +
                        "  Präeklampsie als Ursache für Oberbauchschmerzen im dritten Trimenon nicht vergessen: Blutdruck (BD) und Urin kontrollieren.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Une femme enceinte qui développe ce symptôme est très susceptible d'être extrêmement inquiète qu'il y ait une menace pour sa grossesse. Les niveaux d'anxiété peuvent donc être élevés chez la patiente et son partenaire. Reconnaître cette détresse émotionnelle par une évaluation urgente et complète. La liste ci-dessous répertorie les causes spécifiques à la grossesse et les conditions qui peuvent être exacerbées ou modifiées par la grossesse ; Des causes « banales » (telles que la gastro-entérite, le SCI et la dyspepsie) peuvent évidemment survenir également, mais créent rarement des problèmes de diagnostic et ne sont donc pas prises en compte dans cette section.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  souche de la symphyse pubienne et des ligaments\n" +
                        "  fausse couche : 20 à 40 % des grossesses au premier trimestre\n" +
                        "  travail : 6 % prématuré\n" +
                        "  décollement placentaire : 1/80–200 grossesses\n" +
                        "  pyélonéphrite (surtout vers 20 semaines)\n" +
                        "OCCASIONNEL\n" +
                        "  constipation (cause fréquente mais présente seulement occasionnellement)\n" +
                        "  grossesse extra-utérine (1/250 grossesses)\n" +
                        "  appendicite (1/1000 grossesses)\n" +
                        "  dégénérescence rouge du fi broid\n" +
                        "  torsion/rupture d'un kyste ou d'une tumeur de l'ovaire\n" +
                        "RARE\n" +
                        "  rupture utérine (au Royaume-Uni 1/1500 grossesses, dont 70% dues à une cicatrice césarienne\n" +
                        "déhiscence)\n" +
                        "  torsion utérine (rotation axiale > 90°) : 90 % associée à des fibromes, des masses annexielles et\n" +
                        "anomalies utérines anatomiques\n" +
                        "  congestion du foie due à la pré-éclampsie\n" +
                        "  hématome de la gaine droite");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("Celles-ci seront dictées par l'urgence clinique de la situation. En cas de douleur intense, elles seront effectuées en soins secondaires.\n" +
                        "PROBABLE : analyse d'urine, MSU.\n" +
                        "POSSIBLE : échographie, FBC.\n" +
                        "PETITS CARACTÈRES : laparoscopie.\n" +
                        "  Analyse d'urine : protéinurie dans la pré-éclampsie. Sang, cellules de pus et nitrite dans les infections des voies urinaires (IVU); l'organisme infectant sera confirmé sur MSU.\n" +
                        "  FBC : augmentation du WCC dans l'UTI.\n" +
                        "  L'échographie d'imagerie peut être diagnostique en cas de décollement et de fausse couche; la présence d'une grossesse intra-utérine rend une extra-utérine très improbable ; l'échographie peut également être utile pour détecter un hématome de la gaine du droit.\n" +
                        "  Laparoscopie : pour confi rmer une grossesse extra-utérine");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("La douleur en position debout et en marchant, et soulagée par le repos, avec une sensibilité exquise de la symphyse pubienne, est une «douleur symphysaire» - une cause souvent négligée.\n" +
                        "  Dissiper les angoisses compréhensibles, le cas échéant - en particulier concernant le bien-être du fœtus ou la possibilité d'un accouchement prématuré.\n" +
                        "  Ne soyez pas trop prêt à diagnostiquer une infection urinaire sur la base d'une analyse d'urine anormale - la contamination pendant la grossesse est courante.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La déformation de l'anatomie peut altérer les symptômes et les signes : l'appendicite est notoirement difficile à diagnostiquer au cours du deuxième trimestre. En cas de doute, avouez.\n" +
                        "  Une femme en début de grossesse qui éprouve des douleurs abdominales basses unilatérales suivies de légers saignements ou d'un écoulement noirâtre a une extra-utérine jusqu'à preuve du contraire.\n" +
                        "  Ne négligez pas le diagnostic de travail prématuré. Les femmes sans expérience antérieure de la douleur du travail pourraient ne pas envisager cette possibilité.\n" +
                        "  Le décollement placentaire provoque une douleur intense et continue avec un utérus tendre et dur. Les saignements vaginaux peuvent être minimes. Admettez immédiatement.\n" +
                        "  N'oubliez pas la pré-éclampsie comme cause de douleurs épigastriques au troisième trimestre : vérifiez la tension artérielle (TA) et les urines.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("O femeie însărcinată care dezvoltă acest simptom este foarte probabil să fie extrem de îngrijorată că există o amenințare pentru sarcina ei. Prin urmare, nivelurile de anxietate pot fi ridicate la pacient și partenerul ei. Recunoașteți această suferință emoțională printr-o evaluare urgentă și completă. Aici sunt enumerate cauzele specifice sarcinii și afecțiunile care pot fi exacerbate sau modificate de sarcină; Cauzele „funcționale” (cum ar fi gastroenterita, IBS și dispepsia) pot apărea în mod evident, dar rareori creează probleme de diagnostic și, prin urmare, nu sunt luate în considerare în această secțiune.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  simfiza pubiană și încordarea ligamentelor\n" +
                        "  avort spontan: 20-40% din sarcinile din primul trimestru\n" +
                        "  travaliu: 6% prematur\n" +
                        "  desprinderea placentară: 1/80–200 sarcini\n" +
                        "  pielonefrită (în special în jurul a 20 de săptămâni)\n" +
                        "OCAZIONAL\n" +
                        "  constipație (cauza comună, dar apare doar ocazional)\n" +
                        "  sarcina extrauterina (1/250 sarcini)\n" +
                        "  apendicita (1/1000 sarcini)\n" +
                        "  degenerarea roșie a fibroidului\n" +
                        "  torsiunea/ruptura chistului sau tumorii ovariene\n" +
                        "RAR\n" +
                        "  ruptură uterină (în Marea Britanie 1/1500 sarcini, dintre care 70% din cauza cicatricii cezariene\n" +
                        "dehiscență)\n" +
                        "  torsiunea uterină (rotație axială >90°): 90% asociată cu fibromi, mase anexe și\n" +
                        "anomalii anatomice uterine\n" +
                        "  congestie hepatică din cauza preeclampsiei\n" +
                        "  hematom cu teaca dreptului");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Acestea vor fi dictate de urgența clinică a situației. În cazul durerilor severe, acestea se vor face în asistență secundară.\n" +
                        "PROBABIL: analize de urină, MSU.\n" +
                        "POSIBIL: ecografie, FBC.\n" +
                        "MILTRA MICI: laparoscopie.\n" +
                        "  Analiza urinei: proteinurie în preeclampsie. Sânge, celule de puroi și nitriți în infecția tractului urinar (ITU); organismul infectant va fi confirmat pe MSU.\n" +
                        "  FBC: a crescut WCC în UTI.\n" +
                        "  Ecografia imagistică poate fi diagnostică în desprinderea și avortul spontan; prezența unei sarcini intrauterine face o ectopică foarte puțin probabilă; ultrasunetele pot fi, de asemenea, utile în detectarea unui hematom în teaca dreptului.\n" +
                        "  Laparoscopie: pentru a confirma sarcina ectopică");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Durerea în picioare și în mers și ameliorată prin odihnă, cu o sensibilitate rafinată a simfizei pubiene, este „durere simfiziană” – o cauză adesea trecută cu vederea.\n" +
                        "  Eliminați anxietățile de înțeles, după caz, în special în ceea ce privește bunăstarea fătului sau posibilitatea unui travaliu prematur.\n" +
                        "  Nu fiți prea pregătiți să diagnosticați ITU pe baza unei analize anormale de urină – contaminarea în timpul sarcinii este obișnuită.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Distorsiunea anatomiei poate modifica simptomele și semnele: apendicita este notoriu dificil de diagnosticat în al doilea trimestru. Dacă aveți îndoieli, recunoașteți.\n" +
                        "  O femeie aflată la începutul sarcinii, care suferă de dureri abdominale inferioare unilaterale, urmate de sângerări ușoare sau scurgeri negricioase, are o ectopică până când se dovedește contrariul.\n" +
                        "  Nu treceți cu vederea diagnosticul de travaliu prematur. Femeile fără experiență anterioară de durere de travaliu ar putea să nu ia în considerare această posibilitate.\n" +
                        "  Abrupția placentară provoacă durere severă, continuă, cu un uter sensibil și dur. Sângerarea vaginală poate fi minimă. Recunoaște imediat.\n" +
                        "  Nu uitați de preeclampsie ca o cauză a durerii epigastrice în al treilea trimestru: verificați tensiunea arterială (TA) și urina.");
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