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

public class AfectiuniAbdomenVarsaturiCuSange extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_varsaturi_cu_sange);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune7);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune7);

        if(textView.getText().toString().equals("Blut erbrechen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vomiting blood"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vomir du sang"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vărsături cu sânge"))
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
                textView2.setText("This presentation may vary from a few red streaks in gastric fluid to copious quantities of bright red blood. Blood static in the stomach for a few hours will change to look dark and granular, like coffee grounds. Always do a full urgent assessment, and be prepared for the sudden need for resuscitation.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " peptic ulcer (PU)/acute gastritis\n" +
                        " Mallory–Weiss (M–W) tear\n" +
                        " oesophageal varices (cirrhosis, usually alcoholic)\n" +
                        " malignancy: oesophagus or stomach\n" +
                        " GORD\n" +
                        "OCCASIONAL\n" +
                        " swallowed blood (nose bleeds obvious, haemoptysis less so)\n" +
                        " foreign body or mediastinal tumour perforating oesophagus and aorta (including\n" +
                        "aneurysm)\n" +
                        " haemobilia (blood in bile)\n" +
                        " ingested poisons: corrosive acid and alkali, arsenic\n" +
                        " blood dyscrasias (e.g. thrombocytopenia, leukaemia, haemophilia, aplastic anaemia)\n" +
                        "RARE\n" +
                        " ruptured oesophagus (acute vomiting or trauma)\n" +
                        " spurious: deliberate swallowing and vomiting of blood (Munchausen’s syndrome)\n" +
                        " gallstone perforation of duodenum\n" +
                        " scurvy\n" +
                        " polyarteritis nodosa, systemic lupus erythematosus (SLE)");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("Th ese will be done acutely in hospital, or in general practice aft er an episode of haematemesis when urgent admission is not indicated.\n" +
                        " FBC: essential for assessment of the degree of blood loss. A normal Hb does not exclude a serious bleed as haemodilution may take several hours. Will also reveal blood dyscrasias.\n" +
                        " Upper gastrointestinal (GI) endoscopy is the gold standard for finding the cause of the bleed and biopsy of suspicious lesions.\n" +
                        " Helicobacter testing: in the presence of peptic ulceration.\n" +
                        " LFT and γGT to assess liver function. Alcohol is a signifi cant contributory factor in many cases.\n" +
                        " Plain erect abdominal X-ray (in hospital) useful to look for signs of viscus perforation (air under diaphragm) and, rarely, an ectopic gallstone");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" Take a careful history – patients often confuse vomiting up and coughing up blood.\n" +
                        " If about to visit, ask the patient not to dispose of the evidence – viewing the vomit is worth a thousand words of history.\n" +
                        " Don’t forget the relevance of the patient’s drug history: non-steroidal anti-inflammatory drugs (NSAIDs), steroids and warfarin may all be associated with acute gastric erosions. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Diese Darstellung kann von wenigen roten Streifen in der Magenflüssigkeit bis hin zu reichlich hellrotem Blut variieren. Blut, das sich für ein paar Stunden im Magen befindet, verändert sich und sieht dunkel und körnig aus, wie Kaffeesatz. Führen Sie immer eine vollständige Notfallbewertung durch und seien Sie auf die plötzliche Notwendigkeit einer Wiederbelebung vorbereitet.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Magengeschwür (PU)/akute Gastritis\n" +
                        "  Mallory-Weiss (M–W) Riss\n" +
                        "  Ösophagusvarizen (Zirrhose, meist alkoholisch)\n" +
                        "  Bösartigkeit: Speiseröhre oder Magen\n" +
                        "  GOTT\n" +
                        "GELEGENTLICH\n" +
                        "  verschlucktes Blut (Nasenbluten offensichtlich, Hämoptyse weniger)\n" +
                        "  Fremdkörper oder mediastinaler Tumor, der Speiseröhre und Aorta perforiert (einschließlich\n" +
                        "Aneurysma)\n" +
                        "  Hämobilie (Blut in der Galle)\n" +
                        "  aufgenommene Gifte: ätzende Säuren und Laugen, Arsen\n" +
                        "  Blutdyskrasie (z. B. Thrombozytopenie, Leukämie, Hämophilie, aplastische Anämie)\n" +
                        "SELTEN\n" +
                        "  geplatzter Ösophagus (akutes Erbrechen oder Trauma)\n" +
                        "  falsch: absichtliches Schlucken und Erbrechen von Blut (Münchhausen-Syndrom)\n" +
                        "  Gallensteinperforation des Zwölffingerdarms\n" +
                        "  Skorbut\n" +
                        "  Polyarteriitis nodosa, systemischer Lupus erythematodes (SLE)");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("Diese werden akut im Krankenhaus oder in der Allgemeinarztpraxis nach einer Hämatemesis-Episode durchgeführt, wenn eine dringende Aufnahme nicht indiziert ist.\n" +
                        "  FBC: wesentlich zur Beurteilung des Ausmaßes des Blutverlustes. Ein normaler Hb schließt eine schwere Blutung nicht aus, da die Hämodilution mehrere Stunden dauern kann. Wird auch Blutdyskrasien aufdecken.\n" +
                        "  Die Endoskopie des oberen Gastrointestinaltrakts (GI) ist der Goldstandard für die Suche nach der Ursache der Blutung und die Biopsie verdächtiger Läsionen.\n" +
                        "  Helicobacter-Test: bei Magengeschwüren.\n" +
                        "  LFT und γGT zur Beurteilung der Leberfunktion. Alkohol ist in vielen Fällen ein wesentlicher Faktor.\n" +
                        "  Einfache Röntgenaufnahme des aufrechten Abdomens (im Krankenhaus) nützlich, um nach Anzeichen einer Viskusperforation (Luft unter dem Zwerchfell) und selten eines ektopischen Gallensteins zu suchen");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Machen Sie eine sorgfältige Anamnese – Patienten verwechseln häufig Erbrechen und Bluthusten.\n" +
                        "  Wenn Sie einen Besuch planen, bitten Sie den Patienten, die Beweise nicht zu entsorgen – das Erbrochene zu sehen, ist mehr als tausend Worte der Geschichte wert.\n" +
                        "  Vergessen Sie nicht die Bedeutung der Medikamentenanamnese des Patienten: Nichtsteroidale Antiphlogistika (NSAIDs), Steroide und Warfarin können alle mit akuten Magenerosionen in Verbindung gebracht werden.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Tachykardie kann das einzige körperliche Anzeichen einer signifikanten GI-Blutung sein.\n" +
                        "  In allen akuten Fällen Aufnahme, es sei denn, der Patient ist vollkommen gesund und die Ursache offensichtlich und unbedeutend (z. B. verschlucktes Blut oder sehr kleiner Mallory-Weiss-Riss).\n" +
                        "  Der Patient erkennt möglicherweise nicht die Bedeutung von kaffeegemahlenem Erbrechen oder Melaena – erkundigen Sie sich speziell nach diesen Symptomen.\n" +
                        "  Das Troisier-Zeichen (Vergrößerung des linken supraklavikulären Knotens) weist stark auf Malignität hin.\n" +
                        "  Ösophagusvarizen machen nur 5 % der Fälle aus, aber 80 % der Sterblichkeit. Rufen Sie sofort einen Krankenwagen und sichern Sie sich wenn möglich einen intravenösen (IV) Zugang.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Cette présentation peut varier de quelques stries rouges dans le liquide gastrique à de grandes quantités de sang rouge vif. Le sang statique dans l'estomac pendant quelques heures changera pour devenir sombre et granuleux, comme du marc de café. Effectuez toujours une évaluation urgente complète et préparez-vous au besoin soudain de réanimation.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  ulcère peptique (UP)/gastrite aiguë\n" +
                        "  Déchirure de Mallory-Weiss (M-W)\n" +
                        "  varices oesophagiennes (cirrhose, généralement alcoolique)\n" +
                        "  tumeur maligne: œsophage ou estomac\n" +
                        "  GORD\n" +
                        "OCCASIONNEL\n" +
                        "  sang avalé (saignements de nez évidents, hémoptysie moins)\n" +
                        "  corps étranger ou tumeur médiastinale perforant l'œsophage et l'aorte (y compris\n" +
                        "anévrisme)\n" +
                        "  hémobilie (sang dans la bile)\n" +
                        "  poisons ingérés : acides et alcalins corrosifs, arsenic\n" +
                        "  dyscrasies sanguines (par exemple thrombocytopénie, leucémie, hémophilie, anémie aplasique)\n" +
                        "RARE\n" +
                        "  rupture de l'œsophage (vomissements aigus ou traumatisme)\n" +
                        "  faux : déglutition et vomissement délibérés de sang (syndrome de Munchausen)\n" +
                        "  perforation biliaire du duodénum\n" +
                        "  scorbut\n" +
                        "  périartérite noueuse, lupus érythémateux disséminé (LED)");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("Celles-ci seront réalisées en urgence à l'hôpital, ou en médecine générale après un épisode d'hématémèse lorsque l'admission en urgence n'est pas indiquée.\n" +
                        "  FBC : essentiel pour l'évaluation du degré de perte de sang. Une Hb normale n'exclut pas un saignement grave car l'hémodilution peut prendre plusieurs heures. Révèlera également les dyscrasies sanguines.\n" +
                        "  L'endoscopie gastro-intestinale haute (GI) est l'examen de référence pour trouver la cause de l'hémorragie et la biopsie des lésions suspectes.\n" +
                        "  Test Helicobacter : en présence d'ulcère peptique.\n" +
                        "  LFT et γGT pour évaluer la fonction hépatique. L'alcool est un facteur contributif important dans de nombreux cas.\n" +
                        "  Radiographie abdominale simple en érection (à l'hôpital) utile pour rechercher des signes de perforation viscérale (air sous le diaphragme) et, rarement, un calcul ectopique.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Faites une anamnèse minutieuse - les patients confondent souvent vomissements et crachats de sang.\n" +
                        "  Si vous êtes sur le point de visiter, demandez au patient de ne pas jeter les preuves - voir le vomi vaut mille mots d'histoire.\n" +
                        "  Ne pas oublier la pertinence des antécédents médicamenteux du patient : les anti-inflammatoires non stéroïdiens (AINS), les stéroïdes et la warfarine peuvent tous être associés à des érosions gastriques aiguës.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La tachycardie peut être le seul signe physique d'un saignement gastro-intestinal important.\n" +
                        "  Dans tous les cas aigus, admettre à moins que le patient ne soit parfaitement bien et que la cause soit évidente et insignifiante (par exemple, sang avalé ou déchirure de Mallory-Weiss très mineure).\n" +
                        "  Le patient peut ne pas se rendre compte de l'importance des vomissements de café moulu ou de la méléna – se renseigner spécifiquement sur ces symptômes.\n" +
                        "  Le signe de Troisier (élargissement du nœud supraclaviculaire gauche) suggère fortement une malignité.\n" +
                        "  Les varices œsophagiennes ne représentent que 5 % des cas, mais 80 % de la mortalité. Appelez une ambulance immédiatement et sécurisez l'accès intraveineux (IV) si possible. ");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Această prezentare poate varia de la câteva dungi roșii în lichidul gastric până la cantități mari de sânge roșu aprins. Sângele static din stomac timp de câteva ore se va schimba pentru a arăta întunecat și granulat, ca zațul de cafea. Fă întotdeauna o evaluare completă urgentă și fii pregătit pentru nevoia bruscă de resuscitare.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  ulcer peptic (PU)/gastrită acută\n" +
                        "  Mallory–Weiss (M–W) lacrimă\n" +
                        "  varice esofagiene (ciroză, de obicei alcoolică)\n" +
                        "  malignitate: esofag sau stomac\n" +
                        "  GORD\n" +
                        "OCAZIONAL\n" +
                        "  sânge înghițit (sângerări nazale evidente, hemoptizie mai puțin)\n" +
                        "  corp străin sau tumoră mediastinală care perfora esofagul și aorta (inclusiv\n" +
                        "anevrism)\n" +
                        "  hemopatie (sânge în bilă)\n" +
                        "  otrăvuri ingerate: acid coroziv și alcali, arsenic\n" +
                        "  discrazii sanguine (de exemplu, trombocitopenie, leucemie, hemofilie, anemie aplastică)\n" +
                        "RAR\n" +
                        "  esofag rupt (vărsături acute sau traumatisme)\n" +
                        "  false: înghițire deliberată și vărsături de sânge (sindromul Munchausen)\n" +
                        "  perforarea litiază biliară a duodenului\n" +
                        "  scorbut\n" +
                        "  poliarterita nodoza, lupus eritematos sistemic (LES)");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Acestea se vor face acut în spital, sau în practica generală după un episod de hematemeză când nu este indicată internarea urgentă.\n" +
                        "  FBC: esențial pentru evaluarea gradului de pierdere de sânge. O Hb normală nu exclude o sângerare gravă, deoarece hemodiluția poate dura câteva ore. Va dezvălui, de asemenea, discrazii de sânge.\n" +
                        "  Endoscopia gastrointestinală superioară (GI) este standardul de aur pentru găsirea cauzei sângerării și biopsia leziunilor suspecte.\n" +
                        "  Testarea Helicobacter: în prezența ulcerației peptice.\n" +
                        "  LFT și γGT pentru a evalua funcția hepatică. Alcoolul este un factor contributiv semnificativ în multe cazuri.\n" +
                        "  Radiografia abdominală în erectură simplă (în spital) utilă pentru a căuta semne de perforare a vischiului (aer sub diafragmă) și, rar, un calcul biliar ectopic.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Faceți o anamneză atentă - pacienții confundă adesea vărsăturile și tusea cu sânge.\n" +
                        "  Dacă urmează să vizitați, cereți pacientului să nu arunce dovezile - vizualizarea vărsăturilor valorează cât o mie de cuvinte de istorie.\n" +
                        "  Nu uitați de relevanța istoricului de droguri al pacientului: medicamentele antiinflamatoare nesteroidiene (AINS), steroizii și warfarina pot fi toate asociate cu eroziuni gastrice acute.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Tahicardia poate fi singurul semn fizic al unei hemoragii gastrointestinale semnificative.\n" +
                        "  În toate cazurile acute, admiteți, cu excepția cazului în care pacientul este perfect bine și cauza este evidentă și nesemnificativă (de exemplu, sânge înghițit sau ruptură foarte minoră de Mallory-Weiss).\n" +
                        "  Este posibil ca pacientul să nu-și dea seama de semnificația vărsăturilor sau a melenei măcinate de cafea – întrebați-vă în mod specific despre aceste simptome.\n" +
                        "  Semnul lui Troisier (mărirea nodului supraclavicular stâng) sugerează puternic malignitate.\n" +
                        "  Varicele esofagiene reprezintă doar 5% din cazuri, dar 80% din mortalitate. Apelați imediat o ambulanță și asigurați accesul intravenos (IV) dacă este posibil.");
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