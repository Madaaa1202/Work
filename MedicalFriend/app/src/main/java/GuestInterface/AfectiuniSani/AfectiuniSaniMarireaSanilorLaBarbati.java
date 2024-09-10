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

public class AfectiuniSaniMarireaSanilorLaBarbati extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_sani_marirea_sanilor_la_barbati);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneSani);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneSani1);
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
                textView2.setText("Swelling of the breast tissue in a male is an embarrassing symptom, often presented behind the facade of a ‘calling card’. The following differential diagnosis does not include other causes of breast swelling, which are referred to in the Top tips at the end of this section. In true breast swelling, glandular tissue is palpable behind the areola and is usually bilateral. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " puberty\n" +
                        " drugs (spironolactone, cimetidine, digoxin, cyproterone, fi nasteride, marijuana)\n" +
                        " chronic liver disease (especially alcohol)\n" +
                        " lung carcinoma\n" +
                        " hyperthyroidism\n" +
                        "OCCASIONAL\n" +
                        " hypothyroidism\n" +
                        " hyperprolactinaemia\n" +
                        " haemodialysis and chronic renal failure\n" +
                        " testicular carcinoma\n" +
                        " adrenal carcinoma\n" +
                        " cryptorchidism and other causes of hypogonadism\n" +
                        "RARE\n" +
                        " Klinefelter’s syndrome\n" +
                        " true hermaphroditism and male pseudohermaphroditism\n" +
                        " acromegaly\n" +
                        " McCune–Albright syndrome\n" +
                        " hypernephroma\n" +
                        " carcinoma");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY (except for obvious pubertal cause): FBC, U&E, LFT, TFT.\n" +
                        "POSSIBLE: testosterone, CXR, tests of pituitary function.\n" +
                        "SMALL PRINT: tumour markers, chromosome analysis, CT scan, biopsy.\n" +
                        " FBC: many chronic systemic illnesses can cause gynaecomastia. Th ere may be an associated normochromic, normocytic anaemia. MCV may be raised in hypothyroidism and chronic liver disease.\n" +
                        " U&E and LFT: will reveal chronic renal and liver disease.\n" +
                        " TFT: to diagnose thyroid abnormality.\n" +
                        " Testosterone: reduced in hypogonadism and chronic illness including liver disease.\n" +
                        " CXR: if lung carcinoma a possibility.\n" +
                        " Tests of pituitary function (e.g. FSH, LH, prolactin and other more complex, hospitalbased tests): to check for pituitary hormone abnormalities.\n" +
                        " Tumour markers (usually hospital-based): AFP and HCG act as tumour markers for testicular carcinoma.\n" +
                        " Chromosome analysis: for Klinefelter’s syndrome.\n" +
                        " CT scan (secondary care): may be necessary for testicular tumour staging and diagnosis of adrenal and renal tumours.\n" +
                        " Biopsy: if carcinoma suspected.");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Many male breast swellings are not true breast enlargement: possibilities include simple obesity, abscess, sebaceous cyst and lipoma.\n" +
                        " Pubertal boys will be very self-conscious about gynaecomastia. Reassure them that the problem is common and will resolve, and that they are not changing sex.\n" +
                        " Iatrogenic causes are common – check the drug history (including over-the-counter and illicit drugs). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" In a pubertal boy with a ‘normal’ and a ‘small’ testis, the ‘normal’ one may conceal a tumour. Check with an ultrasound if in doubt.\n" +
                        " Apparent unilateral gynaecomastia in an adult male may be due to breast carcinoma – refer urgently if there is a hard mass, you cannot feel glandular tissue behind the areola, or you’re in any doubt.\n" +
                        " Gynaecomastia with a headache and visual disturbance may be caused by a pituitary tumour. Refer urgently.\n" +
                        " Clubbing of the fi ngers in a smoker with gynaecomastia is virtually pathognomic of bronchial carcinoma. Investigate urgently.");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Die Schwellung des Brustgewebes bei einem Mann ist ein peinliches Symptom, das oft hinter der Fassade einer „Visitenkarte“ dargestellt wird. Die folgende Differentialdiagnose enthält keine anderen Ursachen für die Brustschwellung, auf die am Ende dieses Abschnitts in den Top -Spitzen bezeichnet wird. Bei der echten Brustschwellung ist das Drüsungsgewebe hinter den Warenbekäufen spürbar und normalerweise bilateral.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Pubertät\n" +
                        "  Medikamente (Spironolacton, Cimetidin, Digoxin, Cyproteron, Fi -Nasterid, Marihuana)\n" +
                        "  Chronische Lebererkrankung (insbesondere Alkohol)\n" +
                        "  Lungenkarzinom\n" +
                        "  Hyperthyreose\n" +
                        "GELEGENTLICH\n" +
                        "  Hypothyreose\n" +
                        "  Hyperprolaktinämie\n" +
                        "  Hämodialyse und chronisches Nierenversagen\n" +
                        "  Hodenkarzinom\n" +
                        "  Nebennierenkarzinom\n" +
                        "  Kryptorchidismus und andere Ursachen des Hypogonadismus\n" +
                        "SELTEN\n" +
                        "  Klinefelter -Syndrom\n" +
                        "  wahrer Hermaphroditismus und männlicher Pseudohermaphroditismus\n" +
                        "  Akromegalie\n" +
                        "  McCune -Albright -Syndrom\n" +
                        "  HYPERNEPHROMA\n" +
                        "  Karzinom");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("Wahrscheinlich (mit Ausnahme einer offensichtlichen Pubertätsursache): FBC, U & E, LFT, TFT.\n" +
                        "Möglich: Testosteron, CXR, Tests der Hypophysenfunktion.\n" +
                        "Kleingedruckte: Tumormarker, Chromosomenanalyse, CT -Scan, Biopsie.\n" +
                        " FBC: Viele chronische systemische Krankheiten können Gynäkomastie verursachen. Dies kann eine assoziierte normochrome, normozytische Anämie sein. MCV kann bei Hypothyreose und chronischer Lebererkrankung erhoben werden.\n" +
                        " U & E und LFT: Sie werden chronische Nieren- und Lebererkrankungen enthüllen.\n" +
                        " TFT: Diagnose von Schilddrüsenanomalie.\n" +
                        " Testosteron: Verringerte Hypogonadismus und chronische Erkrankungen einschließlich Lebererkrankungen.\n" +
                        " CXR: Wenn Lungenkarzinom eine Möglichkeit.\n" +
                        " Tests der Hypophysenfunktion (z. B. FSH, LH, Prolaktin und andere komplexere Tests im Krankenhaus): Überprüfen Sie nach Hypophysenhormonanomalien.\n" +
                        " Tumormarker (normalerweise im Krankenhaus): AFP und HCG wirken als Tumormarker für das Hodenkarzinom.\n" +
                        " Chromosomenanalyse: Für das Klinefelter -Syndrom.\n" +
                        " CT -Scan (Sekundärversorgung): Kann für die testikuläre Tumorstaging und die Diagnose von Nebennieren- und Nierentumoren erforderlich sein.\n" +
                        " Biopsie: Wenn das Karzinom vermutet wird.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Viele männliche Brustschwellungen sind keine wahre Brustvergrößerung: Zu den Möglichkeiten gehören einfach Fettleibigkeit, Abszess, Talgzyste und Lipom.\n" +
                        "  Pubertäre Jungen werden Gynaecomastia sehr selbstbewusst sein. Versichern Sie ihnen, dass das Problem häufig ist und sich lösen wird und dass sie den Sex nicht verändern.\n" +
                        "  Iatrogene Ursachen sind häufig-überprüfen Sie die Arzneimittelgeschichte (einschließlich rezeptfreier und illegaler Medikamente).");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("In einem pubertären Jungen mit einem „normalen“ und einem „kleinen“ Hoden kann der „Normale“ einen Tumor verbergen. Wenden Sie sich an einen Ultraschall, wenn Sie Zweifel haben.\n" +
                        "  Scheinbare einseitige Gynäle bei einem erwachsenen Mann kann auf Brustkarzinom zurückzuführen sein. Wenn es eine harte Masse gibt, können Sie sich nicht drüsisches Gewebe hinter den Warenbekäufen fühlen, oder Sie sind in Zweifel.\n" +
                        "  Gynaecomastie mit Kopfschmerzen und Sehstörungen können durch einen Hypophysen -Tumor verursacht werden. Dringend verweisen.\n" +
                        "  Das Clubbing der Fituren in einem Raucher mit Gynacomastia ist praktisch pathognomisch des Bronchialkarzinoms. Dringend untersuchen.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Le gonflement du tissu mammaire chez un mâle est un symptôme embarrassant, souvent présenté derrière la façade d'une «carte de visite». Le diagnostic différentiel suivant n'inclut pas d'autres causes de gonflement des seins, qui sont mentionnées dans les pointes supérieures à la fin de cette section. Dans un véritable gonflement des seins, le tissu glandulaire est palpable derrière l'aréole et est généralement bilatéral.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  puberté\n" +
                        "  médicaments (spironolactone, cimétidine, digoxine, cyproterone, fi nastéride, marijuana)\n" +
                        "  maladie hépatique chronique (en particulier l'alcool)\n" +
                        "  carcinome pulmonaire\n" +
                        "  hyperthyroïdie\n" +
                        "OCCASIONNEL\n" +
                        "  hypothyroïdie\n" +
                        "  hyperprolactinémie\n" +
                        "  hémodialyse et insuffisance rénale chronique\n" +
                        "  carcinome testiculaire\n" +
                        "  carcinome surrénal\n" +
                        "  cryptorchidie et autres causes de l'hypogonadisme\n" +
                        "RARE\n" +
                        "  Le syndrome de Klinefelter\n" +
                        "  le vrai hermaphrodisme et le pseudohermaphrodisme masculin\n" +
                        "  acromégalie\n" +
                        "  Syndrome de McCune - Albright\n" +
                        "  hypernéphrome\n" +
                        "  carcinome");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("Probablement (sauf pour une cause pubertaire évidente): FBC, U&E, LFT, TFT.\n" +
                        "Possible: testostérone, CXR, tests de la fonction hypophysaire.\n" +
                        "Petite impression: marqueurs tumoraux, analyse chromosomique, tomodensitométrie, biopsie.\n" +
                        " FBC: De nombreuses maladies systémiques chroniques peuvent provoquer une gynécomastie. Il peut être une anémie normochromique et normocytaire associée. Le MCV peut être élevé dans l'hypothyroïdie et la maladie hépatique chronique.\n" +
                        " U&E et LFT: révélera une maladie rénale et hépatique chronique.\n" +
                        " TFT: Pour diagnostiquer l'anomalie thyroïdienne.\n" +
                        " Testostérone: réduit dans l'hypogonadisme et les maladies chroniques, y compris les maladies du foie.\n" +
                        " CXR: Si le carcinome du poumon une possibilité.\n" +
                        " Tests de la fonction hypophysaire (par exemple FSH, LH, prolactine et autres tests plus complexes basés sur l'hôpital): pour vérifier les anomalies hormonales hypophysaires.\n" +
                        " Marqueurs tumoraux (généralement à base d'hôpital): l'AFP et le HCG agissent comme des marqueurs tumoraux pour le carcinome testiculaire.\n" +
                        " Analyse chromosomique: pour le syndrome de Klinefelter.\n" +
                        " TDA (soins secondaires): peut être nécessaire pour la stadification des tumeurs testiculaire et le diagnostic des tumeurs surrénales et rénales.\n" +
                        " Biopsie: si le carcinome suspecté.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("De nombreuses gonflements mammaires masculins ne sont pas un véritable élargissement du sein: les possibilités comprennent une obésité simple, un abcès, un kyste sébacé et un lipome.\n" +
                        "  Les garçons pubertaires seront très gênés par la gynécomastie. Rassurez-les que le problème est courant et résoudre, et qu'ils ne changent pas de sexe.\n" +
                        "  Les causes iatrogènes sont courantes - vérifiez les antécédents de la drogue (y compris les drogues en vente libre et illicites).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Chez un garçon pubertaire avec un testicule «normal» et «petit», le «normal» peut cacher une tumeur. Vérifiez avec une échographie en cas de doute.\n" +
                        "  La gynécomastie unilatérale apparente chez un mâle adulte peut être due au carcinome mammaire - se référer de toute urgence s'il y a une masse dure, vous ne pouvez pas ressentir du tissu glandulaire derrière l'aréole, ou si vous avez un doute.\n" +
                        "  La gynécomastie avec un mal de tête et une perturbation visuelle peuvent être causées par une tumeur hypophysaire. Se référer de toute urgence.\n" +
                        "  Le clubbing des fins dans un fumeur atteint de gynécomastie est pratiquement pathognomique du carcinome bronchique. Enquêter d'urgence.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Umflarea țesutului mamar la un bărbat este un simptom jenant, adesea prezentat în spatele fațadei unei „cărți de apel”. Următorul diagnostic diferențial nu include alte cauze ale umflăturii sânilor, la care se face referire în vârfurile de sus la sfârșitul acestei secțiuni. În adevărata umflare a sânului, țesutul glandular este palpabil în spatele areolei și este de obicei bilateral.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  pubertate\n" +
                        "  Droguri (spironolactonă, cimetidină, digoxină, ciproteronă, fi nasteride, marijuana)\n" +
                        "  Boala hepatică cronică (în special alcoolul)\n" +
                        "  Carcinom pulmonar\n" +
                        "  hipertiroidism\n" +
                        "OCAZIONAL\n" +
                        "  Hipotiroidism\n" +
                        "  Hiperprolactinamie\n" +
                        "  hemodializă și insuficiență renală cronică\n" +
                        "  Carcinomul testicular\n" +
                        "  Carcinom suprarenal\n" +
                        "  criptorhidismul și alte cauze ale hipogonadismului\n" +
                        "RAR\n" +
                        "  Sindromul Klinefelter\n" +
                        "  Adevărat hermafroditism și pseudohermaphroditism masculin\n" +
                        "  acromegalie\n" +
                        "  Sindromul McCune - Albright\n" +
                        "  hipernefrom\n" +
                        "  carcinom");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Probabil (cu excepția cauzei pubertale evidente): FBC, U&E, LFT, TFT.\n" +
                        "Posibil: testosteron, CXR, teste ale funcției hipofizare.\n" +
                        "Tipărire mică: markeri tumori, analiza cromozomilor, scanarea CT, biopsie.\n" +
                        " FBC: Multe boli sistemice cronice pot provoca gynaecomastie. Poate fi o anemie normocromică, normocitică asociată. MCV poate fi crescut în hipotiroidism și boli hepatice cronice.\n" +
                        " U&E și LFT: vor dezvălui boli renale și hepatice cronice.\n" +
                        " TFT: Pentru a diagnostica anomalii tiroidiene.\n" +
                        " Testosteron: redus în hipogonadism și boli cronice, inclusiv boli hepatice.\n" +
                        " CXR: Dacă carcinomul pulmonar este o posibilitate.\n" +
                        " Testele funcției hipofizare (de exemplu, FSH, LH, prolactină și alte teste mai complexe, bazate pe spital): Pentru a verifica anomaliile hormonilor hipofizar.\n" +
                        " Markerii tumorii (de obicei pe bază de spital): AFP și HCG acționează ca markeri tumori pentru carcinomul testicular.\n" +
                        " Analiza cromozomilor: pentru sindromul Klinefelter.\n" +
                        " Scanarea CT (îngrijire secundară): Poate fi necesară pentru stadializarea tumorii testiculare și diagnosticul tumorilor suprarenale și renale.\n" +
                        " Biopsie: dacă se suspecta carcinom.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Multe umflături de sân masculine nu sunt adevărate mărirea sânilor: posibilitățile includ obezitate simplă, abces, chist sebaceu și lipom.\n" +
                        "  Băieții pubertali vor fi foarte conștienți de sine în ceea ce privește gynaecomastia. Asigură -le că problema este comună și se va rezolva și că nu schimbă sexul.\n" +
                        "  Cauzele iatrogene sunt frecvente-verificați istoricul drogurilor (inclusiv drogurile fără contra-contor și ilicite).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Într -un băiat pubertal, cu un testic „normal” și un „mic”, „normal” poate ascunde o tumoră. Verificați cu o ecografie dacă aveți îndoieli.\n" +
                        "  Gynaecomastia unilaterală aparentă la un bărbat adult se poate datora carcinomului mamar - consultați urgent dacă există o masă dură, nu puteți simți țesutul glandular în spatele areolei sau aveți în orice îndoială.\n" +
                        "  Gynaecomastia cu o durere de cap și perturbarea vizuală poate fi cauzată de o tumoră hipofizară. Referiți urgent.\n" +
                        "  Clubbing -ul firilor într -un fumător cu gynaecomastia este practic patognomică a carcinomului bronșic. Investigează urgent.");
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