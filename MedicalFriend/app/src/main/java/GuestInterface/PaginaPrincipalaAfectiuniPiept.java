package GuestInterface;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.medicalfriend.R;

public class PaginaPrincipalaAfectiuniPiept extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_piept);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiunePiept);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiunePiept);

        if(textView.getText().toString().equals("Brustschmerzen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Chest pain"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Douleur thoracique"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Dureri în piept"))
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
                textView2.setText("Acute chest pain is a regular visitor to general practice: it may generate more adrenaline in the physician than the patient. In spite of a constellation of causes, a good basic clinical approach will determine the diagnosis in nearly all cases, long before any necessary investigations are complete. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " angina/MI\n" +
                        " GORD\n" +
                        " anxiety (Da Costa’s syndrome)\n" +
                        " pulled muscle\n" +
                        " Tietze’s syndrome (costochondritis)\n" +
                        "OCCASIONAL\n" +
                        " pleurisy\n" +
                        " peptic ulcer\n" +
                        " biliary colic\n" +
                        " shingles\n" +
                        " mastitis\n" +
                        " Bornholm disease\n" +
                        "RARE\n" +
                        " pulmonary infarct\n" +
                        " hypertrophic obstructive cardiomyopathy\n" +
                        " pericarditis\n" +
                        " fractured ribs\n" +
                        " myocarditis\n" +
                        " pneumothorax\n" +
                        " dissecting aortic aneurysm");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: ECG.\n" +
                        "POSSIBLE: FBC, CXR, pulse oximetry, secondary care cardiac investigations, OGD, ultrasound of abdomen.\n" +
                        "SMALL PRINT: Helicobacter tests, ventilation/perfusion scan (hospital-based).\n" +
                        " ECG: may show evidence of cardiac ischaemia, pericarditis or pulmonary embolism.\n" +
                        " FBC: WCC raised in pleurisy and may be raised in Tietze’s syndrome.\n" +
                        " CXR: may reveal chest infection, rib fracture, heart disease, cardiomyopathy or pneumothorax.\n" +
                        " Pulse oximetry: hypoxia a sign of significant cardiac or respiratory problem in the acute setting.\n" +
                        " Secondary care cardiac investigations: to clarify whether a cardiac cause.\n" +
                        " Ultrasound of abdomen: to check for gallstones.\n" +
                        " OGD: to confirm peptic ulcer or oesophagitis.\n" +
                        " Helicobacter tests useful in the presence of duodenal ulcer.\n" +
                        " Ventilation/perfusion scan (in hospital): to confi rm pulmonary infarction. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" The history is all-important and will usually provide the diagnosis. Except in an obvious emergency, take your time getting the facts straight.\n" +
                        " If you feel worried enough to obtain an urgent ECG then you ought to consider whether the patient really requires an urgent medical opinion or admission.\n" +
                        " Watching the patient’s hand as the symptoms are being described can provide very helpful clues. A clenched fi st on the chest is worrying; a single pointing fi nger much less so.\n" +
                        " Musculoskeletal pain and pleurisy both cause pain on deep inspiration – but the former usually also displays muscle or rib tenderness.\n" +
                        " Tietze’s syndrome is distinguished from costochondritis by the presence of a palpable swelling, caused by oedema, at the site of maximal tenderness. However, management is largely the same.\n" +
                        " Always encourage the patient to contact you if the problem persists or deteriorates.\n" +
                        " If in doubt, play safe: give aspirin (if not allergic) and admit.");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("Don’t delay if the symptoms clearly suggest an infarct; admit the patient (via the telephone if necessary).\n" +
                        " A normal ECG does not exclude an infarct. Treat the patient, not the test.\n" +
                        " Symptoms of genuine and signifi cant pathology may be clouded by various ensuing anxiety symptoms. Take time to tease them out.\n" +
                        " Performing unnecessary tests when the diagnosis is clearly anxiety is likely to exacerbate the situation.\n" +
                        " If the diagnosis remains unclear, examine the abdomen, especially for signifi cant epigastric tenderness. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Akuter Brustschmerz ist ein regelmäßiger Gast in der Hausarztpraxis: Er kann beim Arzt mehr Adrenalin auslösen als beim Patienten. Trotz unterschiedlicher Ursachenkonstellationen wird eine gute klinische Grundeinstellung in fast allen Fällen die Diagnose stellen, lange bevor notwendige Abklärungen abgeschlossen sind.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Angina/MI\n" +
                        "  GOTT\n" +
                        "  Angst (Da Costa-Syndrom)\n" +
                        "  gezerrter Muskel\n" +
                        "  Tietze-Syndrom (Costochondritis)\n" +
                        "GELEGENTLICH\n" +
                        "  Pleuritis\n" +
                        "  Magengeschwür\n" +
                        "  Gallenkolik\n" +
                        "  Gürtelrose\n" +
                        "  Mastitis\n" +
                        "  Bornholmer Krankheit\n" +
                        "SELTEN\n" +
                        "  Lungeninfarkt\n" +
                        "  hypertrophe obstruktive Kardiomyopathie\n" +
                        "  Perikarditis\n" +
                        "  gebrochene Rippen\n" +
                        "  Myokarditis\n" +
                        "  Pneumothorax\n" +
                        "  dissezierendes Aortenaneurysma");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: EKG.\n" +
                        "MÖGLICH: FBC, CXR, Pulsoximetrie, sekundärmedizinische Herzuntersuchungen, OGD, Ultraschall des Abdomens.\n" +
                        "KLEINDRUCK: Helicobacter-Tests, Beatmungs-/Perfusionsscan (krankenhausbasiert).\n" +
                        "  EKG: Kann Anzeichen einer Herzischämie, Perikarditis oder Lungenembolie zeigen.\n" +
                        "  FBC: WCC bei Pleuritis und möglicherweise bei Tietze-Syndrom.\n" +
                        "  CXR: Kann Brustinfektion, Rippenbruch, Herzkrankheit, Kardiomyopathie oder Pneumothorax zeigen.\n" +
                        "  Pulsoximetrie: Hypoxie ein Zeichen für ein signifikantes Herz- oder Atemwegsproblem in der Akutsituation.\n" +
                        "  Sekundärmedizinische kardiale Untersuchungen: um abzuklären, ob eine kardiale Ursache vorliegt.\n" +
                        "  Ultraschall des Bauches: um nach Gallensteinen zu suchen.\n" +
                        "  OGD: zur Bestätigung von Magengeschwüren oder Ösophagitis.\n" +
                        "  Helicobacter-Tests nützlich bei Vorhandensein von Zwölffingerdarmgeschwüren.\n" +
                        "  Beatmungs-/Perfusionsscan (im Krankenhaus): zur Bestätigung eines Lungeninfarkts.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Die Anamnese ist von entscheidender Bedeutung und liefert normalerweise die Diagnose. Nehmen Sie sich, außer in einem offensichtlichen Notfall, Zeit, um die Fakten klarzustellen.\n" +
                        "  Wenn Sie sich Sorgen genug machen, um ein dringendes EKG zu erhalten, sollten Sie überlegen, ob der Patient wirklich dringend eine ärztliche Meinung oder Einweisung benötigt.\n" +
                        "  Das Beobachten der Hand des Patienten, während die Symptome beschrieben werden, kann sehr hilfreiche Hinweise liefern. Eine geballte Faust auf der Brust ist besorgniserregend; ein einzelner zeigender Finger viel weniger.\n" +
                        "  Muskel-Skelett-Schmerzen und Pleuritis verursachen beide Schmerzen bei tiefer Inspiration – aber erstere zeigen normalerweise auch Muskel- oder Rippenempfindlichkeit.\n" +
                        "  Das Tietze-Syndrom unterscheidet sich von der Costochondritis durch das Vorhandensein einer tastbaren, durch Ödeme verursachten Schwellung an der Stelle der größten Druckempfindlichkeit. Die Verwaltung ist jedoch weitgehend gleich.\n" +
                        "  Ermutigen Sie den Patienten immer, sich mit Ihnen in Verbindung zu setzen, wenn das Problem fortbesteht oder sich verschlimmert.\n" +
                        "  Im Zweifelsfall auf Nummer sicher gehen: Aspirin geben (wenn nicht allergisch) und zugeben.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Zögern Sie nicht, wenn die Symptome eindeutig auf einen Infarkt hindeuten; Aufnahme des Patienten (ggf. telefonisch).\n" +
                        "  Ein normales EKG schließt einen Infarkt nicht aus. Behandle den Patienten, nicht den Test.\n" +
                        "  Symptome einer echten und signifikanten Pathologie können durch verschiedene nachfolgende Angstsymptome getrübt werden. Nehmen Sie sich Zeit, sie herauszufordern.\n" +
                        "  Unnötige Tests durchzuführen, wenn die Diagnose eindeutig Angst ist, wird die Situation wahrscheinlich verschlimmern.\n" +
                        "  Wenn die Diagnose unklar bleibt, untersuchen Sie das Abdomen, insbesondere auf signifikanten epigastrischen Druckschmerz.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("La douleur thoracique aiguë est un visiteur régulier de la médecine générale : elle peut générer plus d'adrénaline chez le médecin que chez le patient. Malgré une constellation de causes, une bonne approche clinique de base déterminera le diagnostic dans presque tous les cas, bien avant que toutes les investigations nécessaires ne soient terminées.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  angine/IM\n" +
                        "  GORD\n" +
                        "  anxiété (syndrome de Da Costa)\n" +
                        "  élongation musculaire\n" +
                        "  Syndrome de Tietze (costochondrite)\n" +
                        "OCCASIONNEL\n" +
                        "  pleurésie\n" +
                        "  ulcère peptique\n" +
                        "  coliques biliaires\n" +
                        "  zona\n" +
                        "  mastite\n" +
                        "  Maladie de Bornholm\n" +
                        "RARE\n" +
                        "  infarctus pulmonaire\n" +
                        "  cardiomyopathie obstructive hypertrophique\n" +
                        "  péricardite\n" +
                        "  côtes fracturées\n" +
                        "  myocardite\n" +
                        "  pneumothorax\n" +
                        "  disséquer un anévrisme de l'aorte");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : ECG.\n" +
                        "POSSIBLE: FBC, CXR, oxymétrie de pouls, investigations cardiaques de soins secondaires, OGD, échographie de l'abdomen.\n" +
                        "PETITS CARACTÈRES: tests Helicobacter, analyse de ventilation/perfusion (en milieu hospitalier).\n" +
                        "  ECG : peut montrer des signes d'ischémie cardiaque, de péricardite ou d'embolie pulmonaire.\n" +
                        "  FBC : WCC élevé dans la pleurésie et peut être élevé dans le syndrome de Tietze.\n" +
                        "  CXR: peut révéler une infection pulmonaire, une fracture des côtes, une maladie cardiaque, une cardiomyopathie ou un pneumothorax.\n" +
                        "  Oxymétrie de pouls: l'hypoxie est un signe de problème cardiaque ou respiratoire important dans un contexte aigu.\n" +
                        "  Examens cardiaques de soins secondaires: pour déterminer s'il s'agit d'une cause cardiaque.\n" +
                        "  Échographie de l'abdomen: pour rechercher des calculs biliaires.\n" +
                        "  OGD : pour confirmer un ulcère peptique ou une oesophagite.\n" +
                        "  Tests Helicobacter utiles en présence d'ulcère duodénal.\n" +
                        "  Analyse de ventilation/perfusion (à l'hôpital): pour confirmer l'infarctus pulmonaire.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("L'anamnèse est primordiale et fournira généralement le diagnostic. Sauf en cas d'urgence évidente, prenez votre temps pour clarifier les faits.\n" +
                        "  Si vous vous sentez suffisamment inquiet pour obtenir un ECG urgent, vous devez vous demander si le patient a vraiment besoin d'un avis médical ou d'une admission urgente.\n" +
                        "  Regarder la main du patient pendant que les symptômes sont décrits peut fournir des indices très utiles. Un poing fermé sur la poitrine est inquiétant ; un seul doigt pointé beaucoup moins.\n" +
                        "  La douleur musculo-squelettique et la pleurésie provoquent toutes deux des douleurs lors de l'inspiration profonde - mais la première présente généralement également une sensibilité des muscles ou des côtes.\n" +
                        "  Le syndrome de Tietze se distingue de la costochondrite par la présence d'un gonflement palpable, provoqué par un œdème, au site de sensibilité maximale. Cependant, la gestion est sensiblement la même.\n" +
                        "  Encouragez toujours le patient à vous contacter si le problème persiste ou s'aggrave.\n" +
                        "  En cas de doute, jouez la sécurité : donnez de l'aspirine (si pas allergique) et admettez.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Ne tardez pas si les symptômes suggèrent clairement un infarctus; admettre le patient (par téléphone si nécessaire).\n" +
                        "  Un ECG normal n'exclut pas un infarctus. Traitez le patient, pas le test.\n" +
                        "  Les symptômes d'une pathologie authentique et significative peuvent être assombris par divers symptômes d'anxiété qui en découlent. Prenez le temps de les taquiner.\n" +
                        "  Effectuer des tests inutiles lorsque le diagnostic est clairement de l'anxiété est susceptible d'aggraver la situation.\n" +
                        "  Si le diagnostic reste incertain, examinez l'abdomen, en particulier pour une sensibilité épigastrique significative.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Durerea toracică acută este un vizitator obișnuit al practicii generale: poate genera mai multă adrenalină la medic decât la pacient. În ciuda unei constelații de cauze, o bună abordare clinică de bază va determina diagnosticul în aproape toate cazurile, cu mult înainte ca orice investigație necesară să fie finalizată.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  angină/IM\n" +
                        "  GORD\n" +
                        "  anxietate (sindromul Da Costa)\n" +
                        "  muschi tras\n" +
                        "  sindromul Tietze (costocondrită)\n" +
                        "OCAZIONAL\n" +
                        "  pleurezie\n" +
                        "  ulcer peptic\n" +
                        "  colică biliară\n" +
                        "  zona zoster\n" +
                        "  mastită\n" +
                        "  boala Bornholm\n" +
                        "RAR\n" +
                        "  infarct pulmonar\n" +
                        "  cardiomiopatie obstructivă hipertrofică\n" +
                        "  pericardită\n" +
                        "  coaste fracturate\n" +
                        "  miocardită\n" +
                        "  pneumotorax\n" +
                        "  anevrism de aortă de disecție");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: ECG.\n" +
                        "POSIBIL: FBC, CXR, pulsoximetrie, investigatii cardiace secundare, OGD, ecografie de abdomen.\n" +
                        "MILTRA MICI: teste Helicobacter, scanare de ventilație/perfuzie (la spital).\n" +
                        "  ECG: poate prezenta semne de ischemie cardiacă, pericardită sau embolie pulmonară.\n" +
                        "  FBC: WCC crescut în pleurezie și poate fi crescut în sindromul Tietze.\n" +
                        "  CXR: poate evidenția infecție toracică, fractură de coastă, boli de inimă, cardiomiopatie sau pneumotorax.\n" +
                        "  Pulsoximetrie: hipoxia este un semn al unei probleme cardiace sau respiratorii semnificative în situația acută.\n" +
                        "  Investigații cardiace de îngrijire secundară: pentru a clarifica dacă o cauză cardiacă.\n" +
                        "  Ecografia abdomenului: pentru a verifica dacă există calculi biliari.\n" +
                        "  OGD: pentru a confirma ulcerul peptic sau esofagita.\n" +
                        "  Testele Helicobacter utile în prezența ulcerului duodenal.\n" +
                        "  Scanare de ventilație/perfuzie (în spital): pentru a confirma infarctul pulmonar.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Istoricul este extrem de important și va oferi de obicei diagnosticul. Cu excepția unei urgențe evidente, fă-ți timp pentru a clarifica faptele.\n" +
                        "  Dacă vă simțiți suficient de îngrijorat pentru a obține un ECG urgent, atunci ar trebui să vă gândiți dacă pacientul are nevoie într-adevăr de o aviz medical urgent sau de internare.\n" +
                        "  Urmărirea mâinii pacientului în timp ce simptomele sunt descrise poate oferi indicii foarte utile. Un pumn strâns pe piept este îngrijorător; un singur deget arătător cu atât mai puțin.\n" +
                        "  Durerea musculo-scheletică și pleurezia provoacă ambele dureri la inspirația profundă – dar prima prezintă de obicei și sensibilitate musculară sau coaste.\n" +
                        "  Sindromul Tietze se distinge de costocondrită prin prezența unei umflături palpabile, cauzate de edem, la locul sensibilității maxime. Cu toate acestea, managementul este în mare parte același.\n" +
                        "  Încurajați întotdeauna pacientul să vă contacteze dacă problema persistă sau se deteriorează.\n" +
                        "  Dacă aveți îndoieli, jucați în siguranță: dați aspirină (dacă nu este alergic) și recunoașteți.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Nu amânați dacă simptomele sugerează în mod clar un infarct; internați pacientul (prin telefon dacă este necesar).\n" +
                        "  Un ECG normal nu exclude un infarct. Tratați pacientul, nu testul.\n" +
                        "  Simptomele unei patologii autentice și semnificative pot fi estompate de diferite simptome de anxietate care rezultă. Fă-ți timp să-i tachinezi.\n" +
                        "  Efectuarea unor teste inutile atunci când diagnosticul este în mod clar anxietate este probabil să agraveze situația.\n" +
                        "  Dacă diagnosticul rămâne neclar, examinați abdomenul, în special pentru sensibilitate epigastrică semnificativă.");
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