package GuestInterface.AfectiuniCerebrale;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.medicalfriend.R;

public class AfectiuniCerebraleDurereDeCap extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_cerebrale_durere_de_cap);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneCerebral3);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneCerebral3);

        if(textView.getText().toString().equals("Kopfschmerzen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Headache"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Mal de crâne"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Durere de cap"))
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
                textView2.setText("There are almost as many causes for headache in medicine as there are disorders. This universal symptom presents a challenge to all GPs because it is common, very oft en non-organic, but seriously pathological just oft en enough to merit a thorough and usually negative examination. The chance of a sinister hidden problem is always there, but the known vast majority of benign headaches can put the clinician offguard. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " tension headache (underlying anxiety or depression)\n" +
                        " frontal sinusitis\n" +
                        " migraine\n" +
                        " cervical spondylosis\n" +
                        " eye strain\n" +
                        "OCCASIONAL\n" +
                        " any acute febrile illness (common cause of headache but usually presents with other symptoms)\n" +
                        " iatrogenic (e.g. analgesic abuse, calcium antagonists, nitrates)\n" +
                        " chronic daily headache\n" +
                        " reactive hypoglycaemia\n" +
                        " fatigue/sleep deprivation (especially in parents)\n" +
                        " trigeminal, sphenopalatine and occipital neuralgias\n" +
                        " temporal arteritis\n" +
                        " post-concussional syndrome\n" +
                        " menstrual migraines (10–14% of women)\n" +
                        "RARE\n" +
                        " cluster headache\n" +
                        " intracranial lesion (e.g. carcinoma, abscess, haematoma, benign intracranial hypertension)\n" +
                        " meningitis\n" +
                        " intracerebral haemorrhage\n" +
                        " carbon monoxide poisoning (blocked boiler fl ue)\n" +
                        " Paget’s disease of skull\n" +
                        " severe hypertension\n" +
                        " pre-eclampsia");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none.\n" +
                        "POSSIBLE: FBC, ESR.\n" +
                        "SMALL PRINT: U&E, alkaline phosphatase, X-ray of sinuses, cervical spine or skull, CT scan, lumbar puncture.\n" +
                        " FBC: WCC raised in abscess and sinusitis. ESR essential if arteritis suspected.\n" +
                        " U&E: Na+/K+ derangement in pituitary tumours, alkaline phosphatase raised in Paget’s disease.\n" +
                        " X-ray: may see fluid levels in sinusitis (rarely useful in diagnosis). May confi rm cervical spondylosis and Paget’s disease.\n" +
                        " CT scan: to exclude intracranial lesion.\n" +
                        " Lumbar puncture: in suspected meningitis; may also help in diagnosis of benign intracranial hypertension. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" Explore the patient’s fears – the majority are worried about serious pathology, such as a brain tumour, and may leave the consultation dissatisfi ed unless this specifi c worry is addressed.\n" +
                        " Another common concern is hypertension. Patients will expect to have their blood pressure checked, even though this is almost never the cause of the symptom.\n" +
                        " Analgesics may paradoxically exacerbate tension headache. It is more constructive to adopt alternative approaches, such as relaxation techniques or antidepressants, as appropriate.\n" +
                        " Headache caused by an intracranial lesion usually produces other neurological symptoms or signs.");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("Suspect subarachnoid haemorrhage given a history of sudden explosive headache. It is frequently described as ‘like a blow to the head’.\n" +
                        " If temporal arteritis is suspected, treat immediately. Th e ESR provides retrospective confirmation only.\n" +
                        " Beware of the pregnant woman complaining of headache in the third trimester: check the blood pressure, ankles and urinalysis. Headache, particularly with visual disturbance, may be a symptom of impending eclampsia.\n" +
                        " A new and increasing headache present on waking and increased by stooping or straining may be due to raised intracranial pressure. Check for other symptoms and signs and refer urgently if in doubt.\n" +
                        " If a headache feels and smells like migraine, then it’s a migraine regardless of age. However, beware of making this the diagnosis in the elderly without systematically ruling out more sinister causes first.");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("In der Medizin gibt es fast so viele Ursachen für Kopfschmerzen, wie es Erkrankungen gibt. Dieses universelle Symptom stellt alle Hausärzte vor eine Herausforderung, da es häufig auftritt, sehr oft nicht organisch, aber ernsthaft pathologisch ist, gerade oft genug, um eine gründliche und normalerweise negative Untersuchung zu rechtfertigen. Die Möglichkeit eines düsteren versteckten Problems ist immer da, aber die bekannte große Mehrheit gutartiger Kopfschmerzen kann den Arzt überraschen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Spannungskopfschmerz (unterschwellige Angst oder Depression)\n" +
                        "  Stirnhöhlenentzündung\n" +
                        "  Migräne\n" +
                        "  zervikale Spondylose\n" +
                        "  Überanstrengung der Augen\n" +
                        "GELEGENTLICH\n" +
                        "  jede akute fieberhafte Erkrankung (häufige Ursache von Kopfschmerzen, aber normalerweise mit anderen Symptomen einhergehend)\n" +
                        "  iatrogen (z. B. Analgetikamissbrauch, Calciumantagonisten, Nitrate)\n" +
                        "  chronische tägliche Kopfschmerzen\n" +
                        "  reaktive Hypoglykämie\n" +
                        "  Müdigkeit/Schlafentzug (insbesondere bei Eltern)\n" +
                        "  Trigeminus-, Sphenopalatinus- und Okzipitalneuralgien\n" +
                        "  Arteriitis temporalis\n" +
                        "  Postkompressionssyndrom\n" +
                        "  Menstruationsmigräne (10–14 % der Frauen)\n" +
                        "SELTEN\n" +
                        "  Cluster-Kopfschmerz\n" +
                        "  intrakranielle Läsion (z. B. Karzinom, Abszess, Hämatom, benigne intrakranielle Hypertonie)\n" +
                        "  Meningitis\n" +
                        "  intrazerebrale Blutung\n" +
                        "  Kohlenmonoxidvergiftung (verstopfter Kesselabzug)\n" +
                        "  Morbus Paget des Schädels\n" +
                        "  schwerer Bluthochdruck\n" +
                        "  Präeklampsie");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine.\n" +
                        "MÖGLICH: EBK, ESR.\n" +
                        "KLEINDRUCK: U&E, alkalische Phosphatase, Röntgen der Nasennebenhöhlen, der Halswirbelsäule oder des Schädels, CT-Scan, Lumbalpunktion.\n" +
                        "  FBC: WCC bei Abszess und Sinusitis erhöht. ESR bei Verdacht auf Arteriitis unerlässlich.\n" +
                        "  U&E: Na+/K+-Störung bei Hypophysentumoren, alkalische Phosphatase erhöht bei Morbus Paget.\n" +
                        "  Röntgen: kann Flüssigkeitsspiegel bei Sinusitis erkennen (selten hilfreich für die Diagnose). Kann zervikale Spondylose und Morbus Paget bestätigen.\n" +
                        "  CT-Scan: zum Ausschluss einer intrakraniellen Läsion.\n" +
                        "  Lumbalpunktion: bei Verdacht auf Meningitis; kann auch bei der Diagnose einer gutartigen intrakraniellen Hypertonie hilfreich sein.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Untersuchen Sie die Ängste des Patienten – die Mehrheit macht sich Sorgen über eine ernsthafte Pathologie, wie z. B. einen Hirntumor, und kann die Konsultation unzufrieden verlassen, wenn diese spezielle Sorge nicht angesprochen wird.\n" +
                        "  Ein weiteres häufiges Anliegen ist Bluthochdruck. Die Patienten werden erwarten, dass ihr Blutdruck überprüft wird, obwohl dies fast nie die Ursache des Symptoms ist.\n" +
                        "  Analgetika können Spannungskopfschmerzen paradoxerweise verschlimmern. Konstruktiver ist es, gegebenenfalls alternative Ansätze wie Entspannungstechniken oder Antidepressiva anzuwenden.\n" +
                        "  Kopfschmerzen, die durch eine intrakranielle Läsion verursacht werden, erzeugen normalerweise andere neurologische Symptome oder Anzeichen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Verdacht auf Subarachnoidalblutung angesichts plötzlicher explosiver Kopfschmerzen in der Vorgeschichte. Es wird oft als „wie ein Schlag auf den Kopf“ beschrieben.\n" +
                        "  Bei Verdacht auf Arteriitis temporalis sofort behandeln. Der ESR liefert nur eine rückwirkende Bestätigung.\n" +
                        "  Hüten Sie sich vor Schwangeren, die im dritten Trimester über Kopfschmerzen klagen: Überprüfen Sie den Blutdruck, die Knöchel und die Urinanalyse. Kopfschmerzen, insbesondere bei Sehstörungen, können ein Symptom einer drohenden Eklampsie sein.\n" +
                        "  Ein neuer und zunehmender Kopfschmerz, der beim Aufwachen auftritt und durch Bücken oder Anstrengung verstärkt wird, kann auf einen erhöhten intrakraniellen Druck zurückzuführen sein. Suchen Sie nach anderen Symptomen und Anzeichen und wenden Sie sich im Zweifelsfall dringend an den Arzt.\n" +
                        "  Wenn sich Kopfschmerzen wie Migräne anfühlen und riechen, dann ist es unabhängig vom Alter eine Migräne. Hüten Sie sich jedoch davor, dies bei älteren Menschen zu diagnostizieren, ohne zuerst düsterere Ursachen systematisch auszuschließen.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Il existe presque autant de causes de maux de tête en médecine que de troubles. Ce symptôme universel pose un défi à tous les médecins généralistes car il est courant, très souvent non organique, mais gravement pathologique juste assez souvent pour mériter un examen approfondi et généralement négatif. Le risque d'un sinistre problème caché est toujours là, mais la grande majorité connue des maux de tête bénins peut mettre le clinicien au dépourvu.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  céphalée de tension (anxiété ou dépression sous-jacente)\n" +
                        "  sinusite frontale\n" +
                        "  migraine\n" +
                        "  arthrose cervicale\n" +
                        "  fatigue des yeux\n" +
                        "OCCASIONNEL\n" +
                        "  toute maladie fébrile aiguë (cause fréquente de maux de tête mais présente généralement d'autres symptômes)\n" +
                        "  iatrogène (par exemple, abus d'analgésiques, antagonistes du calcium, nitrates)\n" +
                        "  maux de tête quotidiens chroniques\n" +
                        "  hypoglycémie réactive\n" +
                        "  fatigue/privation de sommeil (surtout chez les parents)\n" +
                        "  névralgies trigéminales, sphéno-palatines et occipitales\n" +
                        "  artérite temporale\n" +
                        "  syndrome post-commotionnel\n" +
                        "  migraines menstruelles (10 à 14 % des femmes)\n" +
                        "RARE\n" +
                        "  céphalée en grappe\n" +
                        "  lésion intracrânienne (par exemple carcinome, abcès, hématome, hypertension intracrânienne bénigne)\n" +
                        "  méningite\n" +
                        "  hémorragie intracérébrale\n" +
                        "  intoxication au monoxyde de carbone (conduit de chaudière bouché)\n" +
                        "  Maladie de Paget du crâne\n" +
                        "  hypertension sévère\n" +
                        "  pré-éclampsie");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun.\n" +
                        "POSSIBLE : FBC, ESR.\n" +
                        "PETITS CARACTÈRES : U&E, phosphatase alcaline, radiographie des sinus, de la colonne cervicale ou du crâne, tomodensitométrie, ponction lombaire.\n" +
                        "  FBC : WCC élevé dans les abcès et les sinusites. ESR indispensable en cas de suspicion d'artérite.\n" +
                        "  U&E : dérèglement Na+/K+ dans les tumeurs hypophysaires, augmentation de la phosphatase alcaline dans la maladie de Paget.\n" +
                        "  Radiographie : peut voir les niveaux de liquide dans la sinusite (rarement utile pour le diagnostic). Peut confirmer une arthrose cervicale et la maladie de Paget.\n" +
                        "  Scanner : pour exclure une lésion intracrânienne.\n" +
                        "  Ponction lombaire : en cas de suspicion de méningite ; peut également aider au diagnostic de l'hypertension intracrânienne bénigne.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Explorer les peurs du patient – la majorité s'inquiète d'une pathologie grave, telle qu'une tumeur au cerveau, et peut quitter la consultation insatisfaite si cette inquiétude spécifique n'est pas abordée.\n" +
                        "  Une autre préoccupation commune est l'hypertension. Les patients s'attendent à ce que leur tension artérielle soit vérifiée, même si ce n'est presque jamais la cause du symptôme.\n" +
                        "  Les antalgiques peuvent paradoxalement exacerber les céphalées de tension. Il est plus constructif d'adopter des approches alternatives, telles que des techniques de relaxation ou des antidépresseurs, selon le cas.\n" +
                        "  Les maux de tête causés par une lésion intracrânienne produisent généralement d'autres symptômes ou signes neurologiques.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Suspecter une hémorragie sous-arachnoïdienne en raison d'antécédents de céphalée explosive soudaine. Il est souvent décrit comme « comme un coup sur la tête ».\n" +
                        "  Si une artérite temporale est suspectée, traitez immédiatement. L'ESR ne fournit qu'une confirmation rétrospective.\n" +
                        "  Attention à la femme enceinte qui se plaint de maux de tête au troisième trimestre : vérifier la tension artérielle, les chevilles et l'analyse d'urine. Les maux de tête, en particulier accompagnés de troubles visuels, peuvent être un symptôme d'éclampsie imminente.\n" +
                        "  Un mal de tête nouveau et croissant présent au réveil et augmenté en se baissant ou en forçant peut être dû à une pression intracrânienne élevée. Recherchez d'autres symptômes et signes et référez-vous d'urgence en cas de doute.\n" +
                        "  Si un mal de tête sent et sent comme la migraine, alors c'est une migraine quel que soit l'âge. Attention cependant à en faire le diagnostic chez le sujet âgé sans écarter systématiquement les causes les plus sinistres au préalable.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Există aproape tot atâtea cauze ale durerilor de cap în medicină câte tulburări există. Acest simptom universal prezintă o provocare pentru toți medicii de familie, deoarece este comun, de multe ori non-organic, dar grav patologic suficient de des pentru a merita o examinare amănunțită și de obicei negativă. Șansa unei probleme ascunse sinistre există întotdeauna, dar marea majoritate cunoscută a durerilor de cap benigne îl pot pune pe clinician la surpriză.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  cefalee tensională (anxietate sau depresie subiacentă)\n" +
                        "  sinuzita frontala\n" +
                        "  migrenă\n" +
                        "  spondiloza cervicala\n" +
                        "  oboseala ochilor\n" +
                        "OCAZIONAL\n" +
                        "  orice boală febrilă acută (cauza comună de cefalee, dar se prezintă de obicei cu alte simptome)\n" +
                        "  iatrogen (de exemplu, abuz de analgezice, antagonişti de calciu, nitraţi)\n" +
                        "  dureri de cap cronice zilnice\n" +
                        "  hipoglicemie reactivă\n" +
                        "  oboseală/privarea de somn (în special la părinți)\n" +
                        "  nevralgii trigemenale, sfenopalatine și occipitale\n" +
                        "  arterita temporală\n" +
                        "  sindrom post-conmoțional\n" +
                        "  migrene menstruale (10-14% dintre femei)\n" +
                        "RAR\n" +
                        "  cefalee în ciorchine\n" +
                        "  leziuni intracraniene (de exemplu, carcinom, abces, hematom, hipertensiune intracraniană benignă)\n" +
                        "  meningita\n" +
                        "  hemoragie intracerebrala\n" +
                        "  intoxicație cu monoxid de carbon (coș blocat al cazanului)\n" +
                        "  boala Paget a craniului\n" +
                        "  hipertensiune arterială severă\n" +
                        "  preeclampsie");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul.\n" +
                        "POSIBIL: FBC, ESR.\n" +
                        "IMPRIMĂ MICI: U&E, fosfatază alcalină, radiografie a sinusurilor, coloanei vertebrale cervicale sau craniului, scanare CT, puncție lombară.\n" +
                        "  FBC: WCC crescut în abces și sinuzită. VSH esenţial dacă se suspectează arterită.\n" +
                        "  U&E: tulburări Na+/K+ în tumorile hipofizare, fosfatază alcalină crescută în boala Paget.\n" +
                        "  Raze X: poate observa nivelurile de lichide în sinuzită (rar util în diagnostic). Poate confirma spondiloza cervicală și boala Paget.\n" +
                        "  CT: pentru a exclude leziunea intracraniană.\n" +
                        "  Puncția lombară: în suspiciunea de meningită; poate ajuta, de asemenea, la diagnosticarea hipertensiunii intracraniene benigne.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Explorați temerile pacientului – majoritatea sunt îngrijorați de o patologie gravă, cum ar fi o tumoare cerebrală, și poate părăsi consultația nemulțumită dacă nu este abordată această îngrijorare specifică.\n" +
                        "  O altă îngrijorare comună este hipertensiunea arterială. Pacienții se vor aștepta să li se verifice tensiunea arterială, chiar dacă aceasta nu este aproape niciodată cauza simptomului.\n" +
                        "  Analgezicele pot exacerba, în mod paradoxal, cefaleea tensională. Este mai constructiv să adoptăm abordări alternative, precum tehnici de relaxare sau antidepresive, după caz.\n" +
                        "  Cefaleea cauzată de o leziune intracraniană produce de obicei alte simptome sau semne neurologice.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Suspect de hemoragie subarahnoidiană având în vedere antecedente de cefalee explozivă bruscă. Este descris frecvent ca „ca o lovitură în cap”.\n" +
                        "  Dacă se suspectează arterita temporală, tratați imediat. ESR oferă doar confirmare retrospectivă.\n" +
                        "  Atenție la femeia însărcinată care se plânge de dureri de cap în al treilea trimestru: verificați tensiunea arterială, gleznele și analizele de urină. Cefaleea, în special cu tulburări de vedere, poate fi un simptom al eclampsiei iminente.\n" +
                        "  O cefalee nouă și în creștere prezentă la trezire și crescută prin aplecarea sau încordarea se poate datora presiunii intracraniene crescute. Verificați alte simptome și semne și trimiteți urgent dacă aveți dubii.\n" +
                        "  Dacă o durere de cap simte și miroase a migrenă, atunci este o migrenă indiferent de vârstă. Cu toate acestea, ai grijă să nu faci acest diagnostic la vârstnici, fără a exclude în mod sistematic mai întâi cauze mai sinistre.");
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