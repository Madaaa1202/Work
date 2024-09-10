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

public class AfectiuniCerebraleAmeteala extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_cerebrale_ameteala);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneCerebral2);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneCerebral2);
        if(textView.getText().toString().equals("Schwindel")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Dizziness"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vertiges"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Ameţeală"))
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
                textView2.setText("This common and vague symptom can mean different things to diff erent people. It is treated here as being a sense of light-headedness without the illusion of movement characteristic of vertigo. This is a useful distinction in practice as the causes of true vertigo are different. Dizziness tends to be a heartsink symptom as it is so common, has so many diagnostic possibilities, is so oft en linked with anxiety and other symptoms – and very oft en the exact cause remains obscure. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " viral illness\n" +
                        " anxiety (and hyperventilation)\n" +
                        " hypoglycaemia\n" +
                        " postural hypotension (e.g. elderly and pregnancy)\n" +
                        " vertebrobasilar insuffi ciency (elderly with cervical osteoarthritis)\n" +
                        "OCCASIONAL\n" +
                        " acute intoxication: drugs/alcohol\n" +
                        " effects of chronic alcohol misuse\n" +
                        " iatrogenic: drug therapy (antihypertensives, antidepressants)\n" +
                        " cardiac arrhythmia\n" +
                        " any severe systemic disease\n" +
                        "RARE\n" +
                        " aortic stenosis\n" +
                        " subclavian steal syndrome\n" +
                        " partial seizures\n" +
                        " Addison’s disease\n" +
                        " carbon monoxide poisoning (blocked flue) ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none.\n" +
                        "POSSIBLE: urinalysis, FBC, U&E, LFT, glucometer blood glucose.\n" +
                        "SMALL PRINT: EEG, ECG/24-hour ECG, echocardiography, CT scan.\n" +
                        " Urinalysis for glucose: underlying diabetes may cause dizziness, either through general malaise or because of an autonomic neuropathy.\n" +
                        " FBC: underlying anaemia will exacerbate any cause of light-headedness; raised MCV may indicate alcohol abuse.\n" +
                        " U&E and LFT may be worth measuring if systemic disease suspected; in particular, sodium low, and potassium and urea both high in Addison’s disease; LFT may be abnormal in alcohol abuse.\n" +
                        " Glucometer blood glucose: blood glucose measurement will provide a diagnosis of hypoglycaemia only if done during an episode.\n" +
                        " EEG: if partial epilepsy a possibility (would also then require CT scan) – both arranged by specialist.\n" +
                        " ECG/24 h ECG: for possible arrhythmia.\n" +
                        " Echocardiography: for suspected aortic stenosis. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("The first step in the history is to establish what the patient means by dizziness, and, inparticular, to distinguish it from true vertigo.\n" +
                        " Dizziness is oft en multifactorial, especially in the elderly – so do not necessarily expect to find a single underlying pathology.\n" +
                        " If no clear diagnosis is obvious from the history, the dizziness is long standing, and the patient presents a list of other vague symptoms yet is objectively quite well (e.g. no weight loss), the likely diagnosis is anxiety.\n" +
                        " Don’t forget that commonly prescribed drugs can cause or aggravate postural hypotension – review the patient’s medication. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("If the patient has episodic loss of consciousness as well as dizziness, then the chances of signifi cant pathology are much greater: investigate or refer.\n" +
                        " In puzzling cases, ask about other family members and type of domestic heating used.\n" +
                        "Carbon monoxide poisoning is a completely avoidable but regular killer.\n" +
                        " If an aortic murmur is heard, refer urgently. Signifi cant aortic stenois can cause sudden death.\n" +
                        " Remember denial is very strong in alcoholics. If in doubt, check MCV and LFT. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Dieses häufige und vage Symptom kann für verschiedene Menschen unterschiedliche Bedeutungen haben. Es wird hier als ein Gefühl von Benommenheit ohne die für Schwindel charakteristische Bewegungsillusion behandelt. Dies ist in der Praxis eine nützliche Unterscheidung, da die Ursachen für echten Schwindel unterschiedlich sind. Schwindel ist in der Regel ein Herzschmerzsymptom, da es so häufig vorkommt, so viele diagnostische Möglichkeiten bietet, so oft mit Angstzuständen und anderen Symptomen verbunden ist – und sehr oft die genaue Ursache im Dunkeln bleibt.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Viruserkrankung\n" +
                        "  Angst (und Hyperventilation)\n" +
                        "  Hypoglykämie\n" +
                        "  orthostatische Hypotonie (z. B. bei älteren Menschen und Schwangerschaft)\n" +
                        "  vertebrobasiläre Insuffizienz (ältere Menschen mit zervikaler Arthrose)\n" +
                        "GELEGENTLICH\n" +
                        "  akute Vergiftung: Drogen/Alkohol\n" +
                        "  Auswirkungen von chronischem Alkoholmissbrauch\n" +
                        "  iatrogen: medikamentöse Therapie (Antihypertensiva, Antidepressiva)\n" +
                        "  Herzrythmusstörung\n" +
                        "  jede schwere systemische Erkrankung\n" +
                        "SELTEN\n" +
                        "  Aortenstenose\n" +
                        "  Subclavia-Steal-Syndrom\n" +
                        "  partielle Anfälle\n" +
                        "  Addison-Krankheit\n" +
                        "  Kohlenmonoxidvergiftung (verstopfter Rauchabzug)");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine.\n" +
                        "MÖGLICH: Urinanalyse, FBC, U&E, LFT, Glukometer Blutzucker.\n" +
                        "KLEINDRUCK: EEG, EKG/24-Stunden-EKG, Echokardiographie, CT-Scan.\n" +
                        "  Urinanalyse für Glukose: Der zugrunde liegende Diabetes kann Schwindel verursachen, entweder durch allgemeines Unwohlsein oder aufgrund einer autonomen Neuropathie.\n" +
                        "  FBC: zugrunde liegende Anämie verschlimmert jede Ursache von Benommenheit; Erhöhtes MCV kann auf Alkoholmissbrauch hindeuten.\n" +
                        "  U&E und LFT können bei Verdacht auf eine systemische Erkrankung gemessen werden; insbesondere Natrium niedrig und Kalium und Harnstoff beide hoch bei der Addison-Krankheit; LFT kann bei Alkoholmissbrauch abnormal sein.\n" +
                        "  Glukometer-Blutzucker: Die Blutzuckermessung liefert nur dann eine Diagnose einer Hypoglykämie, wenn sie während einer Episode durchgeführt wird.\n" +
                        "  EEG: falls partielle Epilepsie möglich (wäre dann auch CT erforderlich) – beides vom Facharzt angeordnet.\n" +
                        "  EKG/24 h EKG: bei möglicher Arrhythmie.\n" +
                        "  Echokardiographie: bei Verdacht auf Aortenstenose.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Der erste Schritt in der Anamnese besteht darin, festzustellen, was der Patient unter Schwindel versteht, und ihn insbesondere von echtem Schwindel zu unterscheiden.\n" +
                        "  Schwindel ist oft multifaktoriell bedingt, insbesondere bei älteren Menschen – erwarten Sie also nicht unbedingt, eine einzige zugrunde liegende Pathologie zu finden.\n" +
                        "  Wenn aus der Anamnese keine eindeutige Diagnose ersichtlich ist, der Schwindel seit langem besteht und der Patient eine Liste mit anderen vagen Symptomen aufweist, es ihm aber objektiv recht gut geht (z. B. kein Gewichtsverlust), ist die wahrscheinliche Diagnose Angst.\n" +
                        "  Vergessen Sie nicht, dass häufig verschriebene Medikamente eine posturale Hypotonie verursachen oder verschlimmern können – überprüfen Sie die Medikation des Patienten.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Wenn der Patient einen episodischen Bewusstseinsverlust sowie Schwindel hat, dann ist die Wahrscheinlichkeit einer signifikanten Pathologie viel größer: Untersuchen Sie ihn oder überweisen Sie ihn.\n" +
                        "  Fragen Sie in rätselhaften Fällen nach anderen Familienmitgliedern und der Art der Heizung im Haushalt.\n" +
                        "Eine Kohlenmonoxidvergiftung ist ein völlig vermeidbarer, aber regelmäßiger Killer.\n" +
                        "  Wenn ein Aortengeräusch zu hören ist, wenden Sie sich dringend an den Arzt. Eine signifikante Aortenstenose kann zum plötzlichen Tod führen.\n" +
                        "  Denken Sie daran, dass Verleugnung bei Alkoholikern sehr stark ist. Überprüfen Sie im Zweifelsfall MCV und LFT.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Ce symptôme commun et vague peut signifier différentes choses pour différentes personnes. Il est traité ici comme étant une sensation d'étourdissement sans l'illusion de mouvement caractéristique du vertige. C'est une distinction utile dans la pratique car les causes du vrai vertige sont différentes. Les étourdissements ont tendance à être un symptôme de dépression car ils sont si courants, ont de nombreuses possibilités de diagnostic, sont si souvent liés à l'anxiété et à d'autres symptômes - et très souvent la cause exacte reste obscure.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  Maladie virale\n" +
                        "  anxiété (et hyperventilation)\n" +
                        "  hypoglycémie\n" +
                        "  hypotension posturale (par exemple personnes âgées et grossesse)\n" +
                        "  insuffisance vertébrobasilaire (personnes âgées souffrant d'arthrose cervicale)\n" +
                        "OCCASIONNEL\n" +
                        "  intoxication aiguë : drogues/alcool\n" +
                        "  effets de l'abus chronique d'alcool\n" +
                        "  iatrogène : traitement médicamenteux (antihypertenseurs, antidépresseurs)\n" +
                        "  arythmie cardiaque\n" +
                        "  toute maladie systémique grave\n" +
                        "RARE\n" +
                        "  sténose aortique\n" +
                        "  syndrome de vol sous-clavier\n" +
                        "  crises partielles\n" +
                        "  La maladie d'Addison\n" +
                        "  intoxication au monoxyde de carbone (conduit bouché)");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun.\n" +
                        "POSSIBLE : analyse d'urine, FBC, U&E, LFT, glucomètre glycémie.\n" +
                        "PETITS CARACTÈRES: EEG, ECG/ECG 24heures, échocardiographie, tomodensitométrie.\n" +
                        "  Analyse d'urine pour le glucose: le diabète sous-jacent peut provoquer des étourdissements, soit par un malaise général, soit en raison d'une neuropathie autonome.\n" +
                        "  FBC: l'anémie sous-jacente exacerbera toute cause d'étourdissement; un MCV élevé peut indiquer un abus d'alcool.\n" +
                        "  L'U&E et le LFT peuvent valoir la peine d'être mesurés si une maladie systémique est suspectée; en particulier, faible teneur en sodium, potassium et urée, tous deux élevés dans la maladie d'Addison ; LFT peut être anormal dans l'abus d'alcool.\n" +
                        "  Glucomètre glycémique : la mesure de la glycémie fournira un diagnostic d'hypoglycémie uniquement si elle est effectuée au cours d'un épisode.\n" +
                        "  EEG: si l'épilepsie partielle est une possibilité (nécessiterait alors également un scanner) - les deux organisés par un spécialiste.\n" +
                        "  ECG/ECG 24 h : pour une éventuelle arythmie.\n" +
                        "  Échocardiographie: en cas de suspicion de sténose aortique.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("La première étape de l'anamnèse consiste à établir ce que le patient entend par étourdissements et, en particulier, à le distinguer du vrai vertige.\n" +
                        "  Les vertiges sont souvent multifactoriels, en particulier chez les personnes âgées – ne vous attendez donc pas nécessairement à trouver une seule pathologie sous-jacente.\n" +
                        "  Si aucun diagnostic clair n'est évident à partir de l'anamnèse, que les étourdissements sont de longue date et que le patient présente une liste d'autres symptômes vagues mais qu'il se sent objectivement assez bien (par exemple, pas de perte de poids), le diagnostic probable est l'anxiété.\n" +
                        "  N'oubliez pas que les médicaments couramment prescrits peuvent provoquer ou aggraver l'hypotension orthostatique - révisez la médication du patient.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Si le patient a des pertes de conscience épisodiques ainsi que des étourdissements, alors les risques de pathologie significative sont beaucoup plus grands : enquêtez ou référez-vous.\n" +
                        "  Dans les cas déroutants, renseignez-vous sur les autres membres de la famille et le type de chauffage domestique utilisé.\n" +
                        "L'empoisonnement au monoxyde de carbone est un tueur tout à fait évitable mais régulier.\n" +
                        "  Si un souffle aortique est entendu, référez-vous d'urgence. Un sténose aortique important peut entraîner une mort subite.\n" +
                        "  Rappelez-vous que le déni est très fort chez les alcooliques. En cas de doute, vérifiez MCV et LFT.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Acest simptom comun și vag poate însemna lucruri diferite pentru diferiți oameni. Este tratată aici ca fiind o senzație de amețeală fără iluzia de mișcare caracteristică vertijului. Aceasta este o distincție utilă în practică, deoarece cauzele vertijului adevărat sunt diferite. Amețelile tinde să fie un simptom care trage inima, deoarece este atât de comun, are atât de multe posibilități de diagnostic, este atât de des asociat cu anxietatea și alte simptome – și de foarte multe ori cauza exactă rămâne obscură.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  boala virala\n" +
                        "  anxietate (și hiperventilație)\n" +
                        "  hipoglicemie\n" +
                        "  hipotensiune arterială posturală (de exemplu, vârstnici și sarcină)\n" +
                        "  insuficiență vertebrobazilară (vârstnici cu osteoartrită cervicală)\n" +
                        "OCAZIONAL\n" +
                        "  intoxicație acută: droguri/alcool\n" +
                        "  Efectele abuzului cronic de alcool\n" +
                        "  iatrogen: terapie medicamentoasă (antihipertensive, antidepresive)\n" +
                        "  aritmie cardiaca\n" +
                        "  orice boală sistemică severă\n" +
                        "RAR\n" +
                        "  stenoza aortica\n" +
                        "  sindromul de furt subclaviar\n" +
                        "  convulsii parțiale\n" +
                        "  Boala Addison\n" +
                        "  otrăvire cu monoxid de carbon (cobus blocat)");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul.\n" +
                        "POSIBIL: analize de urina, FBC, U&E, LFT, glucometru glicemie.\n" +
                        "IMPRIMĂ MICI: EEG, ECG/ECG de 24 de ore, ecocardiografie, scanare CT.\n" +
                        "  Analiza urinei pentru glucoză: diabetul subiacent poate provoca amețeli, fie prin stare generală de rău, fie din cauza unei neuropatii autonome.\n" +
                        "  FBC: anemia de bază va exacerba orice cauză de amețeală; MCV crescut poate indica abuzul de alcool.\n" +
                        "  U&E și LFT pot merita măsurate dacă se suspectează o boală sistemică; în special, sodiu scăzut și potasiu și uree ambele bogate în boala Addison; LFT poate fi anormal în abuzul de alcool.\n" +
                        "  Glucometrul glicemiei: măsurarea glicemiei va oferi un diagnostic de hipoglicemie numai dacă este făcută în timpul unui episod.\n" +
                        "  EEG: în cazul epilepsiei parțiale o posibilitate (ar necesita și tomografia computerizată) – ambele aranjate de specialist.\n" +
                        "  ECG/ECG 24 h: pentru posibile aritmii.\n" +
                        "  Ecocardiografie: pentru suspiciunea de stenoză aortică.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Primul pas în istorie este de a stabili ce înseamnă pacientul prin amețeală și, în special, de a o deosebi de vertijul adevărat.\n" +
                        "  Amețelile sunt adesea multifactoriale, mai ales la vârstnici – așa că nu vă așteptați neapărat să găsiți o singură patologie subiacentă.\n" +
                        "  Dacă nici un diagnostic clar nu este evident din istoric, amețelile sunt de lungă durată și pacientul prezintă o listă de alte simptome vagi, dar este destul de bine în mod obiectiv (de exemplu, fără pierdere în greutate), diagnosticul probabil este anxietatea.\n" +
                        "  Nu uitați că medicamentele prescrise în mod obișnuit pot provoca sau agrava hipotensiunea posturală - revizuiți medicația pacientului.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Dacă pacientul are pierderea episodică a conștienței, precum și amețeli, atunci șansele de patologie semnificativă sunt mult mai mari: investigați sau trimiteți.\n" +
                        "  În cazuri nedumerite, întrebați despre alți membri ai familiei și despre tipul de încălzire utilizată.\n" +
                        "Otrăvirea cu monoxid de carbon este un ucigaș complet evitabil, dar obișnuit.\n" +
                        "  Dacă se aude un suflu aortic, trimiteți urgent. Stenoza aortică semnificativă poate provoca moarte subită.\n" +
                        "  Amintiți-vă că negarea este foarte puternică la alcoolici. Dacă aveți îndoieli, verificați MCV și LFT.");
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