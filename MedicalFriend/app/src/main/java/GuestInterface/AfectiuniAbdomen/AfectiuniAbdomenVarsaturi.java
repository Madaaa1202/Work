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

public class AfectiuniAbdomenVarsaturi extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_varsaturi);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune6);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune6);

        if(textView.getText().toString().equals("Erbrechen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vomiting"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vomissement"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vărsături"))
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
                textView2.setText("Vomiting is one of the commonest reasons for an out-of-hours call – especially for children. While most cases are self-limiting and benign, the possible causes are numerous and the symptoms can herald serious pathology. Careful assessment is required, together with a willingness to review and admit if the diagnosis remains unclear.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " gastroenteritis\n" +
                        " acute viral labyrinthitis (and some other causes of acute vertigo)\n" +
                        " upper respiratory tract infection (URTI) (in children, especially with marked coughing)\n" +
                        " pregnancy\n" +
                        " appendicitis and other causes of the acute abdomen\n" +
                        "OCCASIONAL\n" +
                        " hyper- and hypoglycaemia\n" +
                        " intestinal obstruction\n" +
                        " pyelonephritis\n" +
                        " ureteric calculus\n" +
                        " migraine\n" +
                        " medication (e.g. antibiotics and cytotoxics)\n" +
                        "RARE\n" +
                        " gastroduodenal disease (e.g. pyloric stricture or stenosis, DU, carcinoma)\n" +
                        " meningitis\n" +
                        " cerebral haemorrhage\n" +
                        " bulimia nervosa\n" +
                        " severe constipation\n" +
                        " raised intracranial pressure (e.g. tumour)\n" +
                        " renal failure\n" +
                        " acute glaucoma ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none.\n" +
                        "POSSIBLE: urinalysis, MSU, pregnancy test, blood glucose, FBC, U&E.\n" +
                        "SMALL PRINT: lumbar puncture, abdominal X-rays, IVU, OGD, CT scan.\n" +
                        " Urinalysis: high specifi c gravity suggests dehydration; glucose and ketones indicate hyperglycaemia; blood, white cells and protein, with or without nitrites, suggest UTI (confi rm with MSU); blood alone might indicate a renal stone.\n" +
                        " Pregnancy test: to confi rm or reveal pregnancy.\n" +
                        " Blood glucose: will confi rm hypo- or hyperglycaemia.\n" +
                        " U&E: may be deranged by vomiting; may also reveal underlying renal failure.\n" +
                        " FBC: raised WCC suggests underlying infection or infl ammation. Haemoglobin (Hb) may be reduced in malignancy.\n" +
                        " Lumbar puncture, IVU, abdominal X-rays, OGD and CT scans: required in a few cases depending on the clinical picture and invariably arranged by the relevant specialist.");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Vomiting in children tends to be presented early, when it may be diffi cult to give a defi nite diagnosis. Be honest about this and make sure that parents know to call you again if the symptom doesn’t settle or other ‘alarm’ symptoms develop – or arrange a defi nite time for\n" +
                        "follow-up.\n" +
                        " Remember to look for both the cause (i.e. the aetiology) and the eff ect (i.e. possible dehydration) – especially in the very young and the very old, when the history may be diffi cult to obtain and the eff ects of fl uid loss more marked.\n" +
                        " Check to see if the patient is on any medication. Th is may be causing the vomiting, or it may have serious implications for management (e.g. steroids).\n" +
                        " Don’t forget pregnancy as a cause – the patient may be ‘ignoring’ the possibility. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Unless the diagnosis is obviously migraine, beware the patient with vomiting and a headache – think of meningitis, subarachnoid haemorrhage or raised intracranial pressure.\n" +
                        " Do not treat empirically with anti-emetics – these may mask the true diagnosis or cause diagnostic confusion via side eff ects.\n" +
                        " Have a low threshold for admitting diabetics. Whatever the cause of the vomiting, their diabetes is liable to become uncontrolled.\n" +
                        " Look for acid dental erosion as a clue to bulimia in recurrent vomiting.\n" +
                        " Gastroenteritis should cause increased bowel sounds. In the patient with abdominal pain and vomiting, if bowel sounds are absent or scanty, the diagnosis is likely to be an acute abdomen. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Erbrechen ist einer der häufigsten Gründe für einen Anruf außerhalb der Geschäftszeiten – insbesondere bei Kindern. Während die meisten Fälle selbstlimitierend und gutartig sind, sind die möglichen Ursachen zahlreich und die Symptome können eine ernsthafte Pathologie ankündigen. Eine sorgfältige Beurteilung ist erforderlich, zusammen mit der Bereitschaft zur Überprüfung und Aufnahme, wenn die Diagnose unklar bleibt.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Gastroenteritis\n" +
                        "  akute virale Labyrinthitis (und einige andere Ursachen für akuten Schwindel)\n" +
                        "  Infektion der oberen Atemwege (URTI) (bei Kindern, insbesondere mit ausgeprägtem Husten)\n" +
                        "  Schwangerschaft\n" +
                        "  Appendizitis und andere Ursachen des akuten Abdomens\n" +
                        "GELEGENTLICH\n" +
                        "  Hyper- und Hypoglykämie\n" +
                        "  Darmverschluss\n" +
                        "  Pyelonephritis\n" +
                        "  Ureterstein\n" +
                        "  Migräne\n" +
                        "  Medikamente (z. B. Antibiotika und Zytostatika)\n" +
                        "SELTEN\n" +
                        "  Gastroduodenale Erkrankung (z. B. Pylorusstriktur oder -stenose, DU, Karzinom)\n" +
                        "  Meningitis\n" +
                        "  Hirnblutung\n" +
                        "  Bulimie\n" +
                        "  schwere Verstopfung\n" +
                        "  erhöhter Hirndruck (z. B. Tumor)\n" +
                        "  Nierenversagen\n" +
                        "  akutes Glaukom");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine.\n" +
                        "MÖGLICH: Urinanalyse, MSU, Schwangerschaftstest, Blutzucker, FBC, U&E.\n" +
                        "KLEINDRUCK: Lumbalpunktion, Röntgenaufnahmen des Abdomens, IVU, OGD, CT-Scan.\n" +
                        "  Urinanalyse: Hohes spezifisches Gewicht deutet auf Dehydration hin; Glukose und Ketone weisen auf Hyperglykämie hin; Blut, weiße Blutkörperchen und Protein, mit oder ohne Nitrite, deuten auf UTI hin (mit MSU bestätigen); Blut allein könnte auf einen Nierenstein hinweisen.\n" +
                        "  Schwangerschaftstest: um eine Schwangerschaft zu bestätigen oder aufzudecken.\n" +
                        "  Blutzucker: bestätigt Hypo- oder Hyperglykämie.\n" +
                        "  U&E: kann durch Erbrechen gestört sein; kann auch ein zugrunde liegendes Nierenversagen aufdecken.\n" +
                        "  FBC: Erhöhter WCC weist auf eine zugrunde liegende Infektion oder Entzündung hin. Hämoglobin (Hb) kann bei Malignität reduziert sein.\n" +
                        "  Lumbalpunktion, IVU, Abdomenröntgen, OGD und CT: Je nach Krankheitsbild in wenigen Fällen erforderlich und immer vom jeweiligen Facharzt veranlasst.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Erbrechen bei Kindern tritt in der Regel früh auf, wenn es schwierig sein kann, eine eindeutige Diagnose zu stellen. Seien Sie ehrlich und sorgen Sie dafür, dass die Eltern Sie wieder anrufen können, wenn das Symptom nicht abklingt oder andere „Alarm“-Symptome auftreten – oder vereinbaren Sie einen konkreten Termin\n" +
                        "nachverfolgen.\n" +
                        "  Denken Sie daran, sowohl nach der Ursache (d. h. der Ätiologie) als auch nach der Wirkung (d. h. möglicher Dehydratation) zu suchen – insbesondere bei sehr jungen und sehr alten Menschen, wenn die Anamnese möglicherweise schwer zu erheben ist und die Auswirkungen des Flüssigkeitsverlusts größer sind markiert.\n" +
                        "  Überprüfen Sie, ob der Patient Medikamente einnimmt. Dies kann das Erbrechen verursachen oder schwerwiegende Auswirkungen auf die Behandlung haben (z. B. Steroide).\n" +
                        "  Vergessen Sie nicht die Schwangerschaft als Ursache – die Patientin „ignoriert“ möglicherweise die Möglichkeit.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Wenn die Diagnose nicht offensichtlich Migräne ist, achten Sie auf Erbrechen und Kopfschmerzen – denken Sie an Meningitis, Subarachnoidalblutung oder erhöhten Hirndruck.\n" +
                        "  Behandeln Sie nicht empirisch mit Antiemetika – diese können die wahre Diagnose verschleiern oder durch Nebenwirkungen diagnostische Verwirrung stiften.\n" +
                        "  Haben Sie eine niedrige Schwelle für die Aufnahme von Diabetikern. Was auch immer die Ursache des Erbrechens ist, ihr Diabetes kann unkontrolliert werden.\n" +
                        "  Suchen Sie nach saurer Zahnerosion als Hinweis auf Bulimie bei wiederkehrendem Erbrechen.\n" +
                        "  Gastroenteritis sollte verstärkte Darmgeräusche verursachen. Wenn bei einem Patienten mit Bauchschmerzen und Erbrechen Darmgeräusche fehlen oder kaum vorhanden sind, ist die Diagnose wahrscheinlich ein akutes Abdomen.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Les vomissements sont l'une des raisons les plus courantes d'un appel en dehors des heures d'ouverture, en particulier pour les enfants. Si la plupart des cas sont spontanément résolutifs et bénins, les causes possibles sont nombreuses et les symptômes peuvent annoncer une pathologie grave. Une évaluation minutieuse est nécessaire, ainsi qu'une volonté d'examiner et d'admettre si le diagnostic reste incertain.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  gastro-entérite\n" +
                        "  labyrinthite virale aiguë (et certaines autres causes de vertige aigu)\n" +
                        "  infection des voies respiratoires supérieures (URTI) (chez les enfants, en particulier avec une toux marquée)\n" +
                        "  grossesse\n" +
                        "  appendicite et autres causes de l'abdomen aigu\n" +
                        "OCCASIONNEL\n" +
                        "  hyper et hypoglycémie\n" +
                        "  obstruction intestinale\n" +
                        "  pyélonéphrite\n" +
                        "  calcul urétéral\n" +
                        "  migraine\n" +
                        "  médicaments (par exemple, antibiotiques et cytotoxiques)\n" +
                        "RARE\n" +
                        "  maladie gastroduodénale (par exemple, rétrécissement ou sténose du pylore, UD, carcinome)\n" +
                        "  méningite\n" +
                        "  hémorragie cérébrale\n" +
                        "  boulimie nerveuse\n" +
                        "  constipation sévère\n" +
                        "  augmentation de la pression intracrânienne (par exemple, tumeur)\n" +
                        "  insuffisance rénale\n" +
                        "  glaucome aigu");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun.\n" +
                        "POSSIBLE : analyse d'urine, MSU, test de grossesse, glycémie, FBC, U&E.\n" +
                        "PETITS CARACTÈRES : ponction lombaire, radiographies abdominales, IVU, OGD, tomodensitométrie.\n" +
                        "  Analyse d'urine : une gravité spécifique élevée suggère une déshydratation ; le glucose et les corps cétoniques indiquent une hyperglycémie ; sang, globules blancs et protéines, avec ou sans nitrites, suggèrent UTI (confirmer avec MSU); le sang seul peut indiquer un calcul rénal.\n" +
                        "  Test de grossesse : pour confirmer ou révéler une grossesse.\n" +
                        "  Glycémie : confirmera l'hypo ou l'hyperglycémie.\n" +
                        "  U&E : peut être dérangé par des vomissements ; peut également révéler une insuffisance rénale sous-jacente.\n" +
                        "  FBC : une augmentation du taux de globules blancs suggère une infection ou une inflammation sous-jacente. L'hémoglobine (Hb) peut être réduite en cas de malignité.\n" +
                        "  Ponction lombaire, UIV, radiographies abdominales, OGD et tomodensitogrammes : nécessaires dans quelques cas en fonction du tableau clinique et toujours organisés par le spécialiste concerné.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Les vomissements chez les enfants ont tendance à être présentés tôt, lorsqu'il peut être difficile de donner un diagnostic définitif. Soyez honnête à ce sujet et assurez-vous que les parents savent qu'ils doivent vous rappeler si le symptôme ne s'atténue pas ou si d'autres symptômes « d'alarme » se développent - ou fixez un moment précis pour\n" +
                        "suivi.\n" +
                        "  N'oubliez pas de rechercher à la fois la cause (c'est-à-dire l'étiologie) et l'effet (c'est-à-dire une éventuelle déshydratation) - en particulier chez les très jeunes et les très âgés, lorsque l'anamnèse peut être difficile à obtenir et les effets de la perte de liquide plus importants. marqué.\n" +
                        "  Vérifiez si le patient prend des médicaments. Cela peut être à l'origine des vomissements ou avoir des implications graves pour la prise en charge (par exemple, les stéroïdes).\n" +
                        "  N'oubliez pas la grossesse comme cause - le patient peut \"ignorer\" la possibilité.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("À moins que le diagnostic ne soit manifestement une migraine, méfiez-vous du patient avec des vomissements et des maux de tête - pensez à la méningite, à l'hémorragie sous-arachnoïdienne ou à l'hypertension intracrânienne.\n" +
                        "  Ne pas traiter empiriquement avec des anti-émétiques – ceux-ci peuvent masquer le vrai diagnostic ou entraîner une confusion diagnostique via des eff ets secondaires.\n" +
                        "  Avoir un seuil bas pour l'admission des diabétiques. Quelle que soit la cause des vomissements, leur diabète est susceptible de devenir incontrôlé.\n" +
                        "  Recherchez l'érosion dentaire acide comme indice de la boulimie dans les vomissements récurrents.\n" +
                        "  La gastro-entérite devrait provoquer une augmentation des bruits intestinaux. Chez le patient souffrant de douleurs abdominales et de vomissements, si les bruits intestinaux sont absents ou rares, le diagnostic est susceptible d'être un abdomen aigu.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Vărsăturile sunt unul dintre cele mai frecvente motive pentru un apel în afara orelor de program – în special pentru copii. În timp ce majoritatea cazurilor sunt autolimitante și benigne, cauzele posibile sunt numeroase și simptomele pot anunța o patologie gravă. Este necesară o evaluare atentă, împreună cu dorința de a revizui și de a admite dacă diagnosticul rămâne neclar.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  gastroenterita\n" +
                        "  labirintită virală acută (și alte cauze ale vertijului acut)\n" +
                        "  infecție a căilor respiratorii superioare (URTI) (la copii, în special cu tuse accentuată)\n" +
                        "  sarcina\n" +
                        "  apendicita și alte cauze ale abdomenului acut\n" +
                        "OCAZIONAL\n" +
                        "  hiper- și hipoglicemie\n" +
                        "  obstructie intestinala\n" +
                        "  pielonefrită\n" +
                        "  calculul ureter\n" +
                        "  migrenă\n" +
                        "  medicamente (de exemplu, antibiotice și citotoxice)\n" +
                        "RAR\n" +
                        "  boală gastroduodenală (de exemplu, strictura pilorică sau stenoză, DU, carcinom)\n" +
                        "  meningita\n" +
                        "  hemoragie cerebrală\n" +
                        "  bulimia nervoasă\n" +
                        "  constipație severă\n" +
                        "  presiune intracraniană crescută (de exemplu, tumoră)\n" +
                        "  insuficiență renală\n" +
                        "  glaucom acut");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul.\n" +
                        "POSIBIL: analize de urina, MSU, test de sarcina, glicemie, FBC, U&E.\n" +
                        "LETTRE MICI: puncție lombară, radiografii abdominale, IVU, OGD, CT.\n" +
                        "  Analiza urinei: greutatea specifică mare sugerează deshidratare; glucoza și cetonele indică hiperglicemie; sângele, celulele albe și proteinele, cu sau fără nitriți, sugerează UTI (confirma cu MSU); sângele singur ar putea indica o piatră renală.\n" +
                        "  Test de sarcină: pentru a confirma sau dezvălui sarcina.\n" +
                        "  Glicemia: va confirma hipo- sau hiperglicemia.\n" +
                        "  U&E: poate fi tulburat de vărsături; poate dezvălui, de asemenea, insuficiență renală subiacentă.\n" +
                        "  FBC: WCC crescut sugerează o infecție sau inflamație subiacentă. Hemoglobina (Hb) poate fi redusă în cazul bolilor maligne.\n" +
                        "  Puncție lombară, IVU, radiografii abdominale, OGD și tomografii: necesare în câteva cazuri în funcție de tabloul clinic și aranjate invariabil de specialistul relevant.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Vărsăturile la copii tind să fie prezentate precoce, când poate fi dificil să se pună un diagnostic cert. Fii sincer în privința asta și asigură-te că părinții știu să te sune din nou dacă simptomul nu se instalează sau se dezvoltă alte simptome de „alarma” – sau aranjează o oră definită pentru\n" +
                        "urmare.\n" +
                        "  Nu uitați să căutați atât cauza (adică etiologia), cât și efectul (adică posibila deshidratare) – mai ales la cei foarte tineri și foarte bătrâni, când istoricul poate fi dificil de obținut și efectele pierderii de lichide mai mult. marcat.\n" +
                        "  Verificați dacă pacientul ia vreun medicament. Aceasta poate cauza vărsături sau poate avea implicații grave pentru management (de exemplu, steroizi).\n" +
                        "  Nu uitați sarcina ca cauză – pacienta poate „ignora” posibilitatea.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Cu excepția cazului în care diagnosticul este în mod evident migrenă, aveți grijă la pacientul cu vărsături și dureri de cap - gândiți-vă la meningită, hemoragie subarahnoidiană sau presiune intracraniană crescută.\n" +
                        "  Nu tratați empiric cu antiemetice - acestea pot masca adevăratul diagnostic sau pot provoca confuzii diagnostice prin reacții adverse.\n" +
                        "  Au un prag scăzut pentru admiterea diabeticilor. Oricare ar fi cauza vărsăturilor, diabetul lor este susceptibil să devină necontrolat.\n" +
                        "  Căutați eroziunea dentară acidă ca un indiciu pentru bulimie în vărsăturile recurente.\n" +
                        "  Gastroenterita ar trebui să provoace creșterea zgomotelor intestinale. La pacientul cu dureri abdominale și vărsături, dacă zgomotele intestinale sunt absente sau rare, diagnosticul este probabil să fie un abdomen acut.");
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