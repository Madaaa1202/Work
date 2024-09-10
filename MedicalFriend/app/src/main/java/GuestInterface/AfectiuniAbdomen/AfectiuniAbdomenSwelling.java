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

public class AfectiuniAbdomenSwelling extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_swelling);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune);

        if(textView.getText().toString().equals("Bauchschmerzen bei erwachsenen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Abdominal Swelling"))
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


            if (parent.getItemAtPosition(position).toString().equals("The GP overview")) {
                textView2.setText("");
                textView2.setText("This presentation covers both abdominal and pelvic masses, and general abdominal swelling. The patient may complain of a general increase in girth or of a discrete mass discovered accidentally; alternatively the GP might fi nd the swelling while performing a physical examination. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " #pregnancy\n" +
                        " #irritable bowel syndrome (IBS)\n" +
                        " #constipation\n" +
                        " #fibroid uterus\n" +
                        " #enlarged bladder\n" +
                        "OCCASIONAL\n" +
                        " #ascites (itself has many causes)\n" +
                        " #intestinal obstruction\n" +
                        " #ovarian mass (cyst or malignant tumour)\n" +
                        " #carcinoma of stomach or colon\n" +
                        " #hepatomegaly (various causes)\n" +
                        "RARE\n" +
                        " #splenomegaly (various causes)\n" +
                        " #pancreatic carcinoma\n" +
                        " #aortic aneurysm\n" +
                        " #massive para-aortic lymphadenopathy\n" +
                        " #hydronephrosis, renal cysts and renal malignancy");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: pregnancy test, ultrasound.\n" +
                        "POSSIBLE: urinalysis, FBC, U&E, LFT, CA-125, plain abdomen X-ray.\n" +
                        "SMALL PRINT: barium enema and sigmoidoscopy, paracentesis, CT scan.\n" +
                        " Pregnancy test essential in amenorrhoeic women.\n" +
                        " Urinalysis may reveal microscopic haematuria in renal or bladder tumours.\n" +
                        " Abdominal ultrasound is the quickest and most effi cient way to defi ne the source of most\n" +
                        "abdominal swellings or masses. Ultrasound of pelvis/abdomen may also be indicated\n" +
                        "according to an elevated CA-125 (see below).\n" +
                        " Full blood count (FBC): anaemia likely in malignancy, possible in fi broids with\n" +
                        "menorrhagia; also will reveal blood dyscrasias.\n" +
                        " Urea and electrolytes (U&E) may be deranged in gross renal disease. Liver function tests\n" +
                        "(LFTs) may give a clue to alcoholic hepatomegaly or malignancy. Low albumin in ascites.\n" +
                        " CA-125: may be indicated in women, especially those aged 50 or more, to help exclude\n" +
                        "ovarian cancer.\n" +
                        " Barium enema and sigmoidoscopy: useful to confi rm or exclude colonic disease.\n" +
                        " Plain abdominal X-ray: may show constipation or obstruction (in the latter case, likely to\n" +
                        "be arranged aft er admission).\n" +
                        " Other tests are likely to be arranged aft er specialist referral, e.g. paracentesis (to investigate\n" +
                        "and relieve ascites), CT scanning (to establish nature of mass and its eff ects on surrounding\n" +
                        "structures). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Take care in the history to distinguish between intermittent or variable swelling, and\n" +
                        "progressive swelling. Th e former will probably not be caused by serious pathology, whereas\n" +
                        "the latter may well be.\n" +
                        " Pregnancy can catch out the unwary, particularly when dealing with perimenopausal\n" +
                        "women or teenage girls. Do not accept the claim that ‘I can’t be pregnant’.\n" +
                        " Some ‘swellings’ turn out, on examination, to be impalpable or to represent normal\n" +
                        "anatomy. Th e physical examination may have a therapeutic eff ect. If not, explore the\n" +
                        "patient’s concerns more fully and consider anxiety, depression or other psychological\n" +
                        "problems if symptoms persist.");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("Weight loss in conjunction with abdominal swelling should immediately suggest\n" +
                        "malignancy.\n" +
                        " Acute onset of swelling with abdominal pain suggests obstruction, requiring urgent surgical\n" +
                        "attention.\n" +
                        " Obesity presents difficulties in examination and can be difficult to distinguish from ascites.\n" +
                        "If in doubt, arrange an ultrasound.\n" +
                        " Resonance on percussion does not rule out a solid mass: retroperitoneal masses will push\n" +
                        "bowel anteriorly and may be apparently tympanic. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Diese Präsentation umfasst sowohl Bauch- als auch Beckenraumforderungen und allgemeine Bauchschwellungen. Der Patient kann sich über eine allgemeine Zunahme des Umfangs oder über eine zufällig entdeckte diskrete Masse beschweren; Alternativ kann der Hausarzt die Schwellung bei einer körperlichen Untersuchung feststellen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        " #Schwangerschaft\n" +
                        " #Reizdarmsyndrom (IBS)\n" +
                        " #Verstopfung\n" +
                        " #fibroid Uterus\n" +
                        " #vergrößerte Blase\n" +
                        "GELEGENTLICH\n" +
                        " #Aszites (selbst hat viele Ursachen)\n" +
                        " #Darmverschluss\n" +
                        " #Eierstockmasse (Zyste oder bösartiger Tumor)\n" +
                        " #Karzinom des Magens oder Dickdarms\n" +
                        " #Hepatomegalie (verschiedene Ursachen)\n" +
                        "SELTEN\n" +
                        " #Splenomegalie (verschiedene Ursachen)\n" +
                        " #Pankreaskarzinom\n" +
                        " #Aortenaneurysma\n" +
                        " #Massive paraaortale Lymphadenopathie\n" +
                        " #Hydronephrose, Nierenzysten und Nierenkrebs");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: Schwangerschaftstest, Ultraschall.\n" +
                        "MÖGLICH: Urinanalyse, FBC, U&E, LFT, CA-125, einfaches Abdomen-Röntgen.\n" +
                        "KLEINDRUCK: Bariumeinlauf und Sigmoidoskopie, Parazentese, CT-Scan.\n" +
                        " Schwangerschaftstest bei amenorrhoischen Frauen unerlässlich.\n" +
                        " Die Urinanalyse kann eine mikroskopische Hämaturie bei Nieren- oder Blasentumoren zeigen.\n" +
                        " Abdominal-Ultraschall ist die schnellste und effizienteste Methode, um die Quelle der meisten abdominalen Schwellungen oder Raumforderungen zu bestimmen. Bei erhöhtem CA-125 kann auch eine Ultraschalluntersuchung des Beckens/Abdomens angezeigt sein (siehe unten).\n" +
                        " Vollblutbild (FBC): Anämie wahrscheinlich bei Malignität, möglich bei Myomen mit Menorrhagie; wird auch Blutdyskrasien aufdecken.\n" +
                        " Harnstoff und Elektrolyte (U&E) können bei schweren Nierenerkrankungen gestört sein. Leberfunktionstests (LFTs) können einen Hinweis auf alkoholische Hepatomegalie oder Malignität geben. Niedriges Albumin bei Aszites.\n" +
                        " CA-125: kann bei Frauen indiziert sein, insbesondere bei Frauen ab 50 Jahren, um Eierstockkrebs auszuschließen.\n" +
                        " Bariumeinlauf und Sigmoidoskopie: nützlich, um eine Dickdarmerkrankung zu bestätigen oder auszuschließen.\n" +
                        " Einfache Röntgenaufnahme des Abdomens: kann Verstopfung oder Obstruktion zeigen (im letzteren Fall wird sie wahrscheinlich nach der Aufnahme angeordnet).\n" +
                        " Andere Tests werden wahrscheinlich nach fachärztlicher Überweisung veranlasst, z. Parazentese (um Aszites zu untersuchen und zu entlasten), CT-Scannen (um die Art der Masse und ihre Auswirkungen auf die umgebenden Strukturen festzustellen).");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Achten Sie bei der Anamnese darauf, zwischen intermittierender oder variabler Schwellung und fortschreitender Schwellung zu unterscheiden. Ersteres wird wahrscheinlich nicht durch eine ernsthafte Pathologie verursacht, wohingegen letzteres sehr wohl sein kann.\n" +
                        "  Die Schwangerschaft kann die Unvorsichtigen erwischen, besonders wenn es um Frauen in der Perimenopause oder Mädchen im Teenageralter geht. Akzeptieren Sie nicht die Behauptung „Ich kann nicht schwanger sein“.\n" +
                        "  Einige „Schwellungen“ erweisen sich bei der Untersuchung als nicht fühlbar oder weisen auf eine normale Anatomie hin. Die körperliche Untersuchung kann eine therapeutische Wirkung haben. Wenn nicht, untersuchen Sie die Bedenken des Patienten genauer und ziehen Sie Angstzustände, Depressionen oder andere psychische Probleme in Betracht, wenn die Symptome anhalten.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Gewichtsverlust in Verbindung mit Bauchschwellung sollte sofort auf Malignität hinweisen.\n" +
                        "  Eine akute Schwellung mit Bauchschmerzen deutet auf eine Obstruktion hin und erfordert eine dringende chirurgische Behandlung.\n" +
                        "  Adipositas bereitet Schwierigkeiten bei der Untersuchung und kann schwierig von Aszites zu unterscheiden sein. Im Zweifelsfall einen Ultraschall veranlassen.\n" +
                        "  Resonanz bei Perkussion schließt eine solide Raumforderung nicht aus: Retroperitoneale Raumforderungen drücken den Darm nach vorne und können scheinbar tympanal sein.");
            } else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Cette présentation couvre à la fois les masses abdominales et pelviennes et le gonflement abdominal général. Le patient peut se plaindre d'une augmentation générale de la circonférence ou d'une masse discrète découverte accidentellement ; alternativement, le médecin généraliste pourrait trouver le gonflement lors d'un examen physique.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  #grossesse\n" +
                        "  #syndrome du côlon irritable (IBS)\n" +
                        "  #constipation\n" +
                        "  #fi broid utérus\n" +
                        "  #vessie hypertrophiée\n" +
                        "OCCASIONNEL\n" +
                        "  #ascite (elle-même a de nombreuses causes)\n" +
                        "  #obstruction intestinale\n" +
                        "  #masse ovarienne (kyste ou tumeur maligne)\n" +
                        "  #carcinome de l'estomac ou du côlon\n" +
                        "  #hépatomégalie (causes diverses)\n" +
                        "RARE\n" +
                        "  #splénomégalie (causes diverses)\n" +
                        "  #carcinome pancréatique\n" +
                        "  #anévrisme aortique\n" +
                        "  #adénopathie para-aortique massive\n" +
                        "  #hydronéphrose, kystes rénaux et tumeur maligne rénale");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : test de grossesse, échographie.\n" +
                        "POSSIBLE : analyse d'urine, FBC, U&E, LFT, CA-125, radiographie simple de l'abdomen.\n" +
                        "PETITS CARACTÈRES : lavement baryté et sigmoïdoscopie, paracentèse, tomodensitométrie.\n" +
                        " Test de grossesse indispensable chez la femme en aménorrhée.\n" +
                        " L'analyse d'urine peut révéler une hématurie microscopique dans les tumeurs rénales ou vésicales.\n" +
                        " L'échographie abdominale est le moyen le plus rapide et le plus effi cace de définir la source de la plupart des tuméfactions ou masses abdominales. L'échographie du bassin/abdomen peut également être indiquée en fonction d'un CA-125 élevé (voir ci-dessous).\n" +
                        " Numération sanguine complète (FBC) : anémie probable en cas de malignité, possible en cas de fibrome avec ménorragie ; révélera également des dyscrasies sanguines.\n" +
                        " L'urée et les électrolytes (U&E) peuvent être dérangés dans l'insuffisance rénale macroscopique. Les tests de la fonction hépatique (LFT) peuvent donner un indice d'hépatomégalie ou de malignité alcoolique. Faible taux d'albumine dans l'ascite.\n" +
                        " CA-125 : peut être indiqué chez les femmes, en particulier celles âgées de 50 ans ou plus, pour aider à exclure le cancer de l'ovaire.\n" +
                        " Lavement baryté et sigmoïdoscopie : utiles pour confirmer ou exclure une maladie du côlon.\n" +
                        " Radiographie abdominale standard : peut montrer une constipation ou une obstruction (dans ce dernier cas, susceptible d'être réalisée après l'admission).\n" +
                        " D'autres tests sont susceptibles d'être organisés après la recommandation d'un spécialiste, par ex. paracentèse (pour étudier et soulager l'ascite), tomodensitométrie (pour établir la nature de la masse et ses effets sur les structures environnantes).");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                 textView2.setText("");
                 textView2.setText("Prenez soin dans l'histoire de faire la distinction entre un gonflement intermittent ou variable et un gonflement progressif. Le premier ne sera probablement pas causé par une pathologie grave, alors que le second pourrait bien l'être.\n" +
                         "  La grossesse peut surprendre les imprudents, en particulier lorsqu'il s'agit de femmes en périménopause ou d'adolescentes. N'acceptez pas l'affirmation selon laquelle \"je ne peux pas être enceinte\".\n" +
                         "  Certains « gonflements » s'avèrent, à l'examen, impalpables ou représentatifs d'une anatomie normale. L'examen physique peut avoir un effet thérapeutique. Si ce n'est pas le cas, explorez plus en détail les préoccupations du patient et envisagez l'anxiété, la dépression ou d'autres problèmes psychologiques si les symptômes persistent");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La perte de poids associée à un gonflement abdominal doit immédiatement suggérer une malignité.\n" +
                        "  L'apparition aiguë d'un gonflement avec douleur abdominale suggère une obstruction, nécessitant une intervention chirurgicale urgente.\n" +
                        "  L'obésité présente des difficultés d'examen et peut être difficile à distinguer de l'ascite. En cas de doute, organisez une échographie.\n" +
                        "  La résonance à la percussion n'exclut pas une masse solide : les masses rétropéritonéales pousseront l'intestin vers l'avant et peuvent être d'apparence tympanique.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Această prezentare acoperă atât masele abdominale și pelvine, cât și umflarea abdominală generală. Pacientul se poate plânge de o creștere generală a circumferinței sau de o masă discretă descoperită accidental; alternativ, medicul de familie ar putea găsi umflarea în timp ce efectuează un examen fizic.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  #sarcina\n" +
                        "   #sindromul colonului iritabil (IBS)\n" +
                        "   #constipație\n" +
                        "   #fiuter broid\n" +
                        "   #vezica urinara marita\n" +
                        "OCAZIONAL\n" +
                        "   #ascită (ea însăși are multe cauze)\n" +
                        "   #obstructie intestinala\n" +
                        "   #masa ovariana (chist sau tumora maligna)\n" +
                        "   #carcinom de stomac sau de colon\n" +
                        "   #hepatomegalie (diverse cauze)\n" +
                        "RAR\n" +
                        "   #splenomegalie (diverse cauze)\n" +
                        "   #carcinom pancreatic\n" +
                        "   #anevrism aortic\n" +
                        "   #limfadenopatie para-aortică masivă\n" +
                        "   #hidronefroză, chisturi renale și malignitate renală");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: test de sarcina, ecografie.\n" +
                        "POSIBIL: analiză de urină, FBC, U&E, LFT, CA-125, radiografie abdomen simplu.\n" +
                        "TIPOARE MICI: clisma cu bariu si sigmoidoscopie, paracenteza, CT.\n" +
                        " Test de sarcina esential la femeile amenoreice.\n" +
                        " Analiza urinei poate evidenția hematurie microscopică în tumorile renale sau vezicii urinare.\n" +
                        " Ecografia abdominală este cea mai rapidă și mai eficientă modalitate de a defini sursa majorității umflăturilor sau maselor abdominale. Ecografia pelvisului/abdomenului poate fi, de asemenea, indicată conform unui CA-125 crescut (vezi mai jos).\n" +
                        " Hemoleucograma completă (FBC): anemie probabilă în malignitate, posibilă în fibroamele cu menoragie; va dezvălui, de asemenea, discrazii de sânge.\n" +
                        " Ureea și electroliții (U&E) pot fi deranjați în boala renală macroscopică. Testele funcției hepatice (LFT) pot da un indiciu pentru hepatomegalia alcoolică sau malignitatea. Albumină scăzută în ascită.\n" +
                        " CA-125: poate fi indicat la femei, în special la cele cu vârsta de 50 sau mai mult, pentru a ajuta la excluderea cancerului ovarian.\n" +
                        " Clismă cu bariu și sigmoidoscopie: utile pentru a confirma sau exclude boala colonică.\n" +
                        " Radiografia abdominală simplă: poate arăta constipație sau obstrucție (în acest din urmă caz, probabil să fie aranjată după internare).\n" +
                        " Este posibil ca alte teste să fie aranjate după trimiterea unui specialist, de ex. paracenteză (pentru investigarea și ameliorarea ascitei), scanarea CT (pentru a stabili natura masei și efectele acesteia asupra structurilor înconjurătoare).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Aveți grijă în istoric să distingeți între umflarea intermitentă sau variabilă și umflarea progresivă. Cel dintâi probabil nu va fi cauzat de o patologie gravă, în timp ce cel de-al doilea poate fi foarte bine.\n" +
                        "  Sarcina poate prinde pe cei neprudenți, în special atunci când aveți de-a face cu femei sau adolescente în perimenopauză. Nu accepta afirmația că „nu pot fi însărcinată”.\n" +
                        "  Unele „umflături” se dovedesc, la examinare, a fi impalpabile sau a reprezenta anatomia normală. Examenul fizic poate avea un efect terapeutic. Dacă nu, explorați preocupările pacientului mai pe deplin și luați în considerare anxietatea, depresia sau alte probleme psihologice dacă simptomele persistă");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Pierderea în greutate în combinație cu umflarea abdominală ar trebui să sugereze imediat o malignitate.\n" +
                        "  Debutul acut al tumefacției cu dureri abdominale sugerează obstrucție, necesitând o intervenție chirurgicală urgentă.\n" +
                        "  Obezitatea prezintă dificultăți la examinare și poate fi dificil de diferențiat de ascita. Dacă aveți dubii, faceți o ecografie.\n" +
                        "  Rezonanța la percuție nu exclude o masă solidă: masele retroperitoneale vor împinge intestinul în față și pot fi aparent timpanice.");
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