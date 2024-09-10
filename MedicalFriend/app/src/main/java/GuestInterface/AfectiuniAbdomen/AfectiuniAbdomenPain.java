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

public class AfectiuniAbdomenPain extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_pain);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune2);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune2);

        if(textView.getText().toString().equals("Bauchschmerzen bei erwachsenen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Adult abdominal pain"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Douleurs abdominales chez l'adulte"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Dureri abdominale la adulți"))
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
                textView2.setText("The sudden onset of severe abdominal pain represents a genuine emergency in general practice and is a common out-of-hours call. In the true acute abdomen, the patient is obviously ill, and as the clinical condition may deteriorate rapidly, ensure that you examine the patient as soon as possible.\n" +
                        "NOTE: upper and mid-abdominal pain are dealt with here. Lower abdominal pain is dealt with under ‘acute pelvic pain’ and specifically epigastric-type pain is covered in more detail in the epigastric pain section.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " peptic ulcer\n" +
                        " biliary colic\n" +
                        " appendicitis\n" +
                        " gastroenteritis\n" +
                        " renal colic\n" +
                        "OCCASIONAL\n" +
                        " cholecystitis (may follow biliary colic, but pain is constant and fever present)\n" +
                        " diverticulitis\n" +
                        " acute or subacute bowel obstruction (adhesions, carcinoma, strangulated hernia, volvulus)\n" +
                        " pyelonephritis\n" +
                        " muscular wall pain\n" +
                        " pancreatitis\n" +
                        "RARE\n" +
                        " perforation (e.g. duodenal ulcer (DU), carcinoma) resulting in peritonitis\n" +
                        " hepatitis\n" +
                        " Crohn’s and ulcerative colitis\n" +
                        " ischaemic bowel\n" +
                        " dissecting/leaking aneurysm\n" +
                        " diabetic ketoacidosis (DKA) and other occasional medical causes (e.g. myocardial\n" +
                        "infarction (MI), pneumonia, sickle cell crisis)");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("The only test likely to help the GP is urinalysis: this may reveal haematuria (renal colic), evidence of urinary infection, or glycosuria in DKA. In general, the following investigations will be done in hospital aft er acute admission.\n" +
                        " Full blood count: WCC raised in many causes and confirms acute inflammation or infection.\n" +
                        " U&E essential as abnormalities common with diarrhoea or vomiting. Amylase raised in ischaemic bowel and acute pancreatitis.\n" +
                        " LFT may show raised bilirubin in biliary obstruction, and widespread derangement in hepatitis.\n" +
                        " Helicobacter pylori testing: strong association with peptic ulcer disease.\n" +
                        " Upper GI endoscopy: to visualise upper GI tract.\n" +
                        " Plain erect abdominal X-ray invaluable to confirm perforated viscus (air under diaphragm). Supine also necessary if obstruction suspected. Ninety per cent of renal or ureteric stones will be revealed with a plain abdominal X-ray.\n" +
                        " Ultrasound: helpful to confirm gallstones.\n" +
                        " IVU: for ureteric stones. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Th e aim of assessment is correct disposal rather than an exact diagnosis. Colicky pain may be appropriate to manage at home; constant pain with tenderness is likely to need admission.\n" +
                        " If treating a patient at home, arrange for review as appropriate and ensure that the patient is aware of the symptoms which should prompt urgent reassessment.\n" +
                        " Th e examination is likely to contribute significantly to making the diagnosis – so take particular care and don’t forget the basics such as pulse rate, temperature, bowel sounds and a rectal examination. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Beware ‘gastroenteritis’ masking or developing into an acute appendicitis. Make arrangements for follow-up and emphasise that constant pain needs urgent review.\n" +
                        " Prejudice is easy if the patient has a history of functional problems or irritable bowel. Surgical pathology can happen to anyone, so be objective.\n" +
                        " Beware the elderly patient with an irregular pulse: mesenteric infarction causes severe pain but few signs.\n" +
                        " Don’t forget to examine the hernial orifices, especially if obstruction is a possibility. ");
            }
           //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Das plötzliche Auftreten starker Bauchschmerzen stellt einen echten Notfall in der Allgemeinmedizin dar und ist ein häufiger Anruf außerhalb der Sprechzeiten. Beim echten akuten Abdomen ist der Patient offensichtlich krank, und da sich der klinische Zustand schnell verschlechtern kann, stellen Sie sicher, dass Sie den Patienten so bald wie möglich untersuchen.\n" +
                        "HINWEIS: Ober- und Mittelbauchschmerzen werden hier behandelt. Schmerzen im Unterbauch werden unter „akuter Unterbauchschmerz“ behandelt, und speziell epigastrische Schmerzen werden im Abschnitt epigastrische Schmerzen ausführlicher behandelt.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Magengeschwür\n" +
                        "  Gallenkolik\n" +
                        "  Appendizitis\n" +
                        "  Gastroenteritis\n" +
                        "  Nierenkolik\n" +
                        "GELEGENTLICH\n" +
                        "  Cholezystitis (kann einer Gallenkolik folgen, aber die Schmerzen sind konstant und Fieber vorhanden)\n" +
                        "  Divertikulitis\n" +
                        "  akuter oder subakuter Darmverschluss (Verwachsungen, Karzinom, strangulierte Hernie, Volvulus)\n" +
                        "  Pyelonephritis\n" +
                        "  Muskelwandschmerzen\n" +
                        "  Pankreatitis\n" +
                        "SELTEN\n" +
                        "  Perforation (z. B. Zwölffingerdarmgeschwür (DU), Karzinom), die zu einer Peritonitis führt\n" +
                        "  Hepatitis\n" +
                        "  Morbus Crohn und Colitis ulcerosa\n" +
                        "  ischämischer Darm\n" +
                        "  dissezierendes/undichtes Aneurysma\n" +
                        "  diabetische Ketoazidose (DKA) und andere gelegentliche medizinische Ursachen (z\n" +
                        "Herzinfarkt (MI), Lungenentzündung, Sichelzellkrise)");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("Der einzige Test, der dem Hausarzt wahrscheinlich hilft, ist eine Urinanalyse: Dies kann Hämaturie (Nierenkolik), Hinweise auf eine Harnwegsinfektion oder Glykosurie bei DKA aufdecken. In der Regel werden die folgenden Untersuchungen nach der Akutaufnahme im Krankenhaus durchgeführt.\n" +
                        "  Vollblutbild: WCC bei vielen Ursachen erhöht und bestätigt akute Entzündung oder Infektion.\n" +
                        "  U&E wesentlich, da Anomalien häufig mit Durchfall oder Erbrechen einhergehen. Amylase in ischämischem Darm und akuter Pankreatitis.\n" +
                        "  LFT kann erhöhtes Bilirubin bei Gallenobstruktion und weit verbreitete Störung bei Hepatitis zeigen.\n" +
                        "  Helicobacter-pylori-Test: starke Assoziation mit Magengeschwüren.\n" +
                        "  Endoskopie des oberen Gastrointestinaltrakts: zur Visualisierung des oberen Gastrointestinaltrakts.\n" +
                        "  Einfache Röntgenaufnahme des aufrechten Abdomens von unschätzbarem Wert, um perforierte Eingeweide (Luft unter dem Zwerchfell) zu bestätigen. Bei Verdacht auf Obstruktion auch Rückenlage erforderlich. Neunzig Prozent der Nieren- oder Harnleitersteine werden mit einer einfachen Röntgenaufnahme des Abdomens aufgedeckt.\n" +
                        "  Ultraschall: hilfreich, um Gallensteine zu bestätigen.\n" +
                        "  IVU: für Harnleitersteine.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Ziel der Begutachtung ist nicht die exakte Diagnose, sondern die richtige Entsorgung. Kolikschmerzen können zu Hause behandelt werden; Konstante Schmerzen mit Zärtlichkeit erfordern wahrscheinlich eine Aufnahme.\n" +
                        "  Wenn Sie einen Patienten zu Hause behandeln, vereinbaren Sie gegebenenfalls eine Überprüfung und stellen Sie sicher, dass der Patient sich der Symptome bewusst ist, die eine dringende Neubewertung veranlassen sollten.\n" +
                        "  Die Untersuchung dürfte wesentlich zur Diagnosestellung beitragen – seien Sie also besonders vorsichtig und vergessen Sie die Basics wie Pulsfrequenz, Temperatur, Darmgeräusche und eine rektale Untersuchung nicht.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Hüten Sie sich davor, eine „Gastroenteritis“ zu maskieren oder sich zu einer akuten Appendizitis zu entwickeln. Treffen Sie Vorkehrungen für die Nachsorge und betonen Sie, dass ständige Schmerzen dringend überprüft werden müssen.\n" +
                        "  Vorurteile sind leicht, wenn der Patient in der Vorgeschichte funktionelle Probleme oder Reizdarm hatte. Chirurgische Pathologie kann jedem passieren, also seien Sie objektiv.\n" +
                        "  Vorsicht bei älteren Patienten mit unregelmäßigem Puls: Ein Mesenterialinfarkt verursacht starke Schmerzen, aber nur wenige Anzeichen.\n" +
                        "  Vergessen Sie nicht, die Bruchpforte zu untersuchen, insbesondere wenn eine Obstruktion möglich ist.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("L'apparition soudaine d'une douleur abdominale intense représente une véritable urgence en médecine générale et est un appel fréquent en dehors des heures de bureau. Dans le véritable abdomen aigu, le patient est évidemment malade, et comme l'état clinique peut se détériorer rapidement, assurez-vous d'examiner le patient dès que possible.\n" +
                        "REMARQUE : les douleurs abdominales hautes et médianes sont traitées ici. Les douleurs abdominales basses sont traitées dans la rubrique « douleurs pelviennes aiguës » et les douleurs de type épigastrique sont traitées plus en détail dans la section sur les douleurs épigastriques.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  ulcère peptique\n" +
                        "  coliques biliaires\n" +
                        "  appendicite\n" +
                        "  gastro-entérite\n" +
                        "  colique néphrétique\n" +
                        "OCCASIONNEL\n" +
                        "  cholécystite (peut suivre une colique biliaire, mais la douleur est constante et la fièvre présente)\n" +
                        "  diverticulite\n" +
                        "  occlusion intestinale aiguë ou subaiguë (adhérences, carcinome, hernie étranglée, volvulus)\n" +
                        "  pyélonéphrite\n" +
                        "  douleur à la paroi musculaire\n" +
                        "  pancréatite\n" +
                        "RARE\n" +
                        "  perforation (par exemple ulcère duodénal (UD), carcinome) entraînant une péritonite\n" +
                        "  hépatite\n" +
                        "  Crohn et colite ulcéreuse\n" +
                        "  intestin ischémique\n" +
                        "  anévrisme disséquant/fuyant\n" +
                        "  acidocétose diabétique (ACD) et autres causes médicales occasionnelles (p.\n" +
                        "infarctus du myocarde (IM), pneumonie, crise drépanocytaire)");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("Le seul examen susceptible d'aider le médecin généraliste est l'analyse d'urine : celle-ci peut révéler une hématurie (colique néphrétique), des signes d'infection urinaire ou une glycosurie en cas d'ACD. En général, les examens suivants seront effectués à l'hôpital après une admission en soins aigus.\n" +
                        "  Numération formule sanguine complète : le COE est élevé dans de nombreuses causes et confirme une inflammation ou une infection aiguë.\n" +
                        "  U&E essentielles en tant qu'anomalies courantes avec diarrhée ou vomissements. Amylase élevée dans l'intestin ischémique et la pancréatite aiguë.\n" +
                        "  Le LFT peut montrer une élévation de la bilirubine dans l'obstruction biliaire et un dérangement généralisé dans l'hépatite.\n" +
                        "  Test Helicobacter pylori: forte association avec l'ulcère peptique.\n" +
                        "  Endoscopie gastro-intestinale supérieure : pour visualiser le tractus gastro-intestinal supérieur.\n" +
                        "  Radiographie abdominale simple en érection précieuse pour confirmer le viscère perforé (air sous le diaphragme). Décubitus également nécessaire en cas d'obstruction suspectée. Quatre-vingt-dix pour cent des calculs rénaux ou urétéraux seront révélés par une simple radiographie abdominale.\n" +
                        "  Échographie : utile pour confirmer les calculs biliaires.\n" +
                        "  UIV : pour les calculs urétéraux.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Le but de l'évaluation est une élimination correcte plutôt qu'un diagnostic exact. La douleur colique peut être appropriée à gérer à la maison; une douleur constante avec sensibilité nécessitera probablement une admission.\n" +
                        "  Si vous traitez un patient à domicile, organisez un examen si nécessaire et assurez-vous que le patient est conscient des symptômes qui doivent inciter à une réévaluation urgente.\n" +
                        "  L'examen est susceptible de contribuer de manière significative au diagnostic - soyez donc particulièrement prudent et n'oubliez pas les bases telles que le pouls, la température, les bruits intestinaux et un toucher rectal.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Attention à la « gastro-entérite » masquant ou évoluant vers une appendicite aiguë. Prenez des dispositions pour le suivi et insistez sur le fait que la douleur constante nécessite un examen urgent.\n" +
                        "  Les préjugés sont faciles si le patient a des antécédents de problèmes fonctionnels ou d'intestin irritable. La pathologie chirurgicale peut arriver à n'importe qui, alors soyez objectif.\n" +
                        "  Attention au patient âgé avec un pouls irrégulier : l'infarctus mésentérique provoque des douleurs intenses mais peu de signes.\n" +
                        "  N'oubliez pas d'examiner les orifices herniaires, surtout si une obstruction est possible.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Apariția bruscă a durerii abdominale severe reprezintă o urgență reală în practica generală și este un apel comun în afara orelor de program. În abdomenul acut adevărat, pacientul este în mod evident bolnav și, deoarece starea clinică se poate deteriora rapid, asigurați-vă că examinați pacientul cât mai curând posibil.\n" +
                        "NOTĂ: durerile abdominale superioare și mijlocii sunt tratate aici. Durerea abdominală inferioară este tratată în „durere pelvină acută” și în mod specific durerea de tip epigastric este tratată mai detaliat în secțiunea durere epigastrică.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  ulcer peptic\n" +
                        "  colică biliară\n" +
                        "  apendicită\n" +
                        "  gastroenterita\n" +
                        "  colică renală\n" +
                        "OCAZIONAL\n" +
                        "  colecistită (poate urma colici biliare, dar durerea este constantă și febră)\n" +
                        "  diverticulita\n" +
                        "  obstrucție intestinală acută sau subacută (aderențe, carcinom, hernie strangulată, volvulus)\n" +
                        "  pielonefrită\n" +
                        "  durere de perete muscular\n" +
                        "  pancreatită\n" +
                        "RAR\n" +
                        "  perforație (de exemplu, ulcer duodenal (DU), carcinom) care duce la peritonită\n" +
                        "  hepatită\n" +
                        "  Crohn și colita ulceroasă\n" +
                        "  intestinul ischemic\n" +
                        "  anevrism de disecție/scurgere\n" +
                        "  cetoacidoza diabetică (DKA) și alte cauze medicale ocazionale (de exemplu, miocardică\n" +
                        "infarct (IM), pneumonie, criză de celule falciforme)");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Singurul test care poate ajuta medicul de familie este analiza urinei: aceasta poate evidenția hematurie (colici renale), semne de infecție urinară sau glicozurie în CAD. In general urmatoarele investigatii se vor face in spital dupa internare acuta.\n" +
                        "  Hemoleucograma completă: WCC a crescut în multe cauze și confirmă inflamația sau infecția acută.\n" +
                        "  U&E esențial ca anomalii comune cu diaree sau vărsături. Amilaza crescută în intestinul ischemic și pancreatită acută.\n" +
                        "  LFT poate prezenta bilirubină crescută în obstrucția biliară și tulburări larg răspândite în hepatită.\n" +
                        "  Testarea Helicobacter pylori: asociere puternică cu boala ulcerului peptic.\n" +
                        "  Endoscopie GI superioară: pentru a vizualiza tractul GI superior.\n" +
                        "  Radiografia abdominală în erecție simplă, neprețuită pentru a confirma vâscos perforat (aer sub diafragmă). De asemenea, este necesar dacă se suspectează obstrucția. Nouăzeci la sută din calculii renali sau ureterici vor fi evidențiate cu o radiografie abdominală simplă.\n" +
                        "  Ultrasunete: ajută la confirmarea calculilor biliari.\n" +
                        "  IVU: pentru calculi ureterici.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Scopul evaluării este eliminarea corectă, mai degrabă decât un diagnostic exact. Durerea colică poate fi adecvată pentru a fi gestionată acasă; durerea constantă cu sensibilitate este probabil să necesite admitere.\n" +
                        "  Dacă tratați un pacient la domiciliu, aranjați o revizuire după caz și asigurați-vă că pacientul este conștient de simptomele care ar trebui să determine o reevaluare urgentă.\n" +
                        "  Este posibil ca examinarea să contribuie în mod semnificativ la stabilirea diagnosticului – așa că aveți grijă deosebită și nu uitați de elementele de bază, cum ar fi pulsul, temperatura, zgomotele intestinale și o examinare rectală.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Atenție la mascarea „gastroenteritei” sau care se dezvoltă într-o apendicită acută. Faceți aranjamente pentru urmărire și subliniați că durerea constantă necesită o revizuire urgentă.\n" +
                        "  Prejudecata este ușoară dacă pacientul are antecedente de probleme funcționale sau intestin iritabil. Patologia chirurgicală se poate întâmpla oricui, așa că fii obiectiv.\n" +
                        "  Atenție la pacientul vârstnic cu puls neregulat: infarctul mezenteric provoacă dureri severe, dar puține semne.\n" +
                        "  Nu uitați să examinați orificiile herniei, mai ales dacă obstrucția este posibilă.");
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