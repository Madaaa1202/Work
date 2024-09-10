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

public class AfectiuniCerebraleConfuzie extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_cerebrale_confuzie);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneCerebral);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneCerebral);
        if(textView.getText().toString().equals("Akute Verwirrung")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Acute confusion"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Confusion aiguë"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Confuzie acută"))
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
                textView2.setText("There are hundreds of possible individual causes of confusion. Patients with acute confusion are usually elderly and oft en present out of hours via a call from an anxious relative or neighbour. The dementias constitute the chronic confusional states, which are not considered here. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " hypoxia (respiratory and cardiac)\n" +
                        " systemic infection\n" +
                        " cerebrovascular accident (CVA: stroke and transient ischaemic attack (TIA))\n" +
                        " hypoglycaemia\n" +
                        " diabetic ketoacidosis (DKA)\n" +
                        "OCCASIONAL\n" +
                        " alcohol withdrawal or intoxication\n" +
                        " cerebral infection\n" +
                        " electrolyte imbalance and uraemia\n" +
                        " iatrogenic (e.g. digoxin, diuretics, steroids and opiates)\n" +
                        " myxoedema\n" +
                        " drug abuse\n" +
                        "RARE\n" +
                        " Wernicke’s encephalopathy\n" +
                        " cerebral tumour\n" +
                        " hypo- and hyperparathyroidism\n" +
                        " Cushing’s disease\n" +
                        " postictal state\n" +
                        " carbon monoxide poisoning");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("Acute confusion has so many causes and possible presentations that it is difficult to provide a definitive guide of investigations for the GP. A number of investigations might be considered according to the clinical picture and social circumstances; in the majority of cases, though, the patient will be admitted and necessary tests therefore arranged by the hospital.\n" +
                        "LIKELY: urinalysis, blood sugar (usually glucometer), pulse oximetry.\n" +
                        "POSSIBLE: FBC, CXR, ECG, cardiac enzymes, TFT.\n" +
                        "SMALL PRINT: calcium, digoxin levels, CT scan.\n" +
                        " Urinalysis is very helpful if possible: look for glucose and ketones (DKA), specific gravity (dehydration), pus, blood and nitrite in UTI. Ketones alone in starvation and possibly hypoglycaemia.\n" +
                        " A blood glucometer reading is more practical than a formal blood glucose in the acute situation to diagnose hypo- and hyperglycaemia.\n" +
                        " Pulse oximetry: to detect hypoxia.\n" +
                        " FBC: raised WCC in infections. Raised MCV helpful pointer to excess alcohol and myxoedema.\n" +
                        " U&E important, especially if any signs of dehydration or on diuretics.\n" +
                        " LFT and TFT: alcohol, disseminated malignancy and hypothyroidism should always be considered.\n" +
                        " CXR: may reveal a cause of hypoxaemia (e.g. pneumonia, cardiac failure).\n" +
                        " ECG, cardiac enzymes: if silent infarct suspected as cause.\n" +
                        " Calcium: to detect possible hypo- or hyperparathyroidism.\n" +
                        " Digoxin levels: for digoxin toxicity.\n" +
                        " CT scan: invariably a hospital-based investigation in acute confusion: may reveal space-occupying lesion, bleed or infarct. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" The key to management is establishing that the confusion really is acute rather than a gradual deterioration of cognition. This requires a careful history from someone who knows the patient well.\n" +
                        " Don’t forget a drug history: if little information is available on a visit, check the patient’s medication cupboard.\n" +
                        " In acute confusional states, it can be diffi cult to obtain useful clinical pointers from the patient’s history. The examination therefore assumes greater importance than usual. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("It is virtually impossible to reach a firm diagnosis and treat safely in the home. Be very sure of yourself if you choose not to admit.\n" +
                        " Central cyanosis is an ominous sign. Give oxygen, if possible, and dial 999.\n" +
                        " In a diabetic on treatment, always check the blood sugar – remember that hypoglycaemia can produce confusion with neurological signs, mimicking a CVA.\n" +
                        " Altered physiological responses in the elderly may result in a normal pulse and temperature even in the presence of signifi cant infection. Don’t be misled by this.\n" +
                        " Ask if any other household members have been unwell – carbon monoxide poisoning could affect others too.");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Es gibt Hunderte von möglichen individuellen Ursachen für Verwirrung. Patienten mit akuter Verwirrtheit sind in der Regel ältere Menschen und erscheinen oft außerhalb der Öffnungszeiten durch einen Anruf eines besorgten Verwandten oder Nachbarn. Die Demenzen stellen die chronischen Verwirrtheitszustände dar, die hier nicht betrachtet werden.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Hypoxie (Atemwege und Herz)\n" +
                        "  systemische Infektion\n" +
                        "  Schlaganfall (CVA: Schlaganfall und transitorische ischämische Attacke (TIA))\n" +
                        "  Hypoglykämie\n" +
                        "  Diabetische Ketoazidose (DKA)\n" +
                        "GELEGENTLICH\n" +
                        "  Alkoholentzug oder Vergiftung\n" +
                        "  zerebrale Infektion\n" +
                        "  Elektrolytstörungen und Urämie\n" +
                        "  iatrogen (z. B. Digoxin, Diuretika, Steroide und Opiate)\n" +
                        "  Myxödem\n" +
                        "  Drogenmissbrauch\n" +
                        "SELTEN\n" +
                        "  Wernicke-Enzephalopathie\n" +
                        "  zerebraler Tumor\n" +
                        "  Hypo- und Hyperparathyreoidismus\n" +
                        "  Morbus Cushing\n" +
                        "  postiktaler Zustand\n" +
                        "  Kohlenmonoxidvergiftung");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("Akute Verwirrtheit hat so viele Ursachen und mögliche Erscheinungsformen, dass es schwierig ist, eine definitive Anleitung für Untersuchungen für den Hausarzt zu geben. Je nach Krankheitsbild und sozialen Umständen kommen mehrere Untersuchungen in Betracht; In den meisten Fällen erfolgt jedoch die Aufnahme des Patienten und die Durchführung notwendiger Untersuchungen durch das Krankenhaus.\n" +
                        "WAHRSCHEINLICH: Urinanalyse, Blutzucker (normalerweise Glukometer), Pulsoximetrie.\n" +
                        "MÖGLICH: FBC, CXR, EKG, Herzenzyme, TFT.\n" +
                        "KLEINDRUCK: Kalzium, Digoxinspiegel, CT-Scan.\n" +
                        " Wenn möglich, ist eine Urinanalyse sehr hilfreich: Suchen Sie nach Glukose und Ketonen (DKA), spezifischem Gewicht (Dehydration), Eiter, Blut und Nitrit bei HWI. Ketone allein bei Hunger und möglicherweise Hypoglykämie.\n" +
                        " Eine Blutzuckermessung ist in der akuten Situation praktischer als ein formaler Blutzuckerwert, um Hypo- und Hyperglykämien zu diagnostizieren.\n" +
                        " Pulsoximetrie: zur Erkennung von Hypoxie.\n" +
                        " FBC: erhöhter WCC bei Infektionen. Erhöhter MCV hilfreicher Hinweis auf übermäßigen Alkohol und Myxödem.\n" +
                        " U&E wichtig, besonders bei Anzeichen von Dehydration oder bei Einnahme von Diuretika.\n" +
                        " LFT und TFT: Alkohol, disseminierte Malignität und Hypothyreose sollten immer in Betracht gezogen werden.\n" +
                        " CXR: kann eine Ursache für Hypoxämie aufzeigen (z. B. Lungenentzündung, Herzinsuffizienz).\n" +
                        " EKG, Herzenzyme: bei Verdacht auf stillen Infarkt als Ursache.\n" +
                        " Calcium: um einen möglichen Hypo- oder Hyperparathyreoidismus zu erkennen.\n" +
                        " Digoxinspiegel: für Digoxin-Toxizität.\n" +
                        " CT-Scan: Ausnahmslos eine stationäre Untersuchung bei akuter Verwirrtheit: Kann Raumforderungen, Blutungen oder Infarkte zeigen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Der Schlüssel zum Management besteht darin, festzustellen, dass die Verwirrung wirklich akut ist und nicht eine allmähliche Verschlechterung der Wahrnehmung. Dies erfordert eine sorgfältige Anamnese durch jemanden, der den Patienten gut kennt.\n" +
                        "  Vergessen Sie die Medikamentenanamnese nicht: Wenn bei einem Besuch nur wenige Informationen vorliegen, überprüfen Sie den Medikamentenschrank des Patienten.\n" +
                        "  Bei akuten Verwirrtheitszuständen kann es schwierig sein, nützliche klinische Hinweise aus der Krankengeschichte des Patienten zu erhalten. Der Untersuchung kommt daher eine größere Bedeutung als sonst zu.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Es ist praktisch unmöglich, zu Hause eine sichere Diagnose zu stellen und sicher zu behandeln. Seien Sie sich sehr sicher, wenn Sie sich entscheiden, es nicht zuzugeben.\n" +
                        "  Zentrale Zyanose ist ein ominöses Zeichen. Geben Sie, wenn möglich, Sauerstoff und wählen Sie 999.\n" +
                        "  Überprüfen Sie bei einem Diabetiker in Behandlung immer den Blutzucker – denken Sie daran, dass eine Hypoglykämie zu Verwechslungen mit neurologischen Anzeichen führen kann, die einen CVA vortäuschen.\n" +
                        "  Veränderte physiologische Reaktionen bei älteren Menschen können selbst bei Vorliegen einer signifikanten Infektion zu einem normalen Puls und normaler Temperatur führen. Lassen Sie sich davon nicht täuschen.\n" +
                        "  Fragen Sie, ob sich andere Haushaltsmitglieder unwohl gefühlt haben – eine Kohlenmonoxidvergiftung könnte auch andere betreffen.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("Il existe des centaines de causes individuelles possibles de confusion. Les patients souffrant de confusion aiguë sont généralement âgés et souvent présents en dehors des heures de travail via un appel d'un parent ou d'un voisin anxieux. Les démences constituent les états confusionnels chroniques, qui ne sont pas considérés ici.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  hypoxie (respiratoire et cardiaque)\n" +
                        "  infection systémique\n" +
                        "  accident vasculaire cérébral (AVC : accident vasculaire cérébral et accident ischémique transitoire (AIT))\n" +
                        "  hypoglycémie\n" +
                        "  acidocétose diabétique (ACD)\n" +
                        "OCCASIONNEL\n" +
                        "  sevrage alcoolique ou intoxication\n" +
                        "  infection cérébrale\n" +
                        "  déséquilibre électrolytique et urémie\n" +
                        "  iatrogène (ex. digoxine, diurétiques, stéroïdes et opiacés)\n" +
                        "  myxœdème\n" +
                        "  abus de drogue\n" +
                        "RARE\n" +
                        "  Encéphalopathie de Wernicke\n" +
                        "  tumeur cérébrale\n" +
                        "  hypo- et hyperparathyroïdie\n" +
                        "  La maladie de Cushing\n" +
                        "  état postcritique\n" +
                        "  empoisonnement au monoxyde de carbone");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("La confusion aiguë a tellement de causes et de présentations possibles qu'il est difficile de fournir un guide définitif d'investigations pour le médecin généraliste. Un certain nombre d'investigations peuvent être envisagées en fonction du tableau clinique et des circonstances sociales ; dans la majorité des cas, cependant, le patient sera admis et les tests nécessaires seront donc organisés par l'hôpital.\n" +
                        "PROBABLE : analyse d'urine, glycémie (habituellement glucomètre), oxymétrie de pouls.\n" +
                        "POSSIBLE : FBC, CXR, ECG, enzymes cardiaques, TFT.\n" +
                        "PETITS CARACTÈRES: calcium, taux de digoxine, tomodensitométrie.\n" +
                        " L'analyse d'urine est très utile si possible: recherchez le glucose et les cétones (ACD), la gravité spécifique (déshydratation), le pus, le sang et les nitrites dans les infections urinaires. Cétones seules en cas de famine et éventuellement d'hypoglycémie.\n" +
                        " Une lecture de glycémie est plus pratique qu'une glycémie formelle dans la situation aiguë pour diagnostiquer l'hypoglycémie et l'hyperglycémie.\n" +
                        " Oxymétrie de pouls : pour détecter l'hypoxie.\n" +
                        " FBC : COE élevé dans les infections. Pointeur utile MCV élevé à l'excès d'alcool et au myxœdème.\n" +
                        " U&E important, surtout en cas de signes de déshydratation ou de diurétiques.\n" +
                        " LFT et TFT: l'alcool, les tumeurs malignes disséminées et l'hypothyroïdie doivent toujours être pris en compte.\n" +
                        " CXR: peut révéler une cause d'hypoxémie (par exemple, pneumonie, insuffisance cardiaque).\n" +
                        " ECG, enzymes cardiaques : si infarctus silencieux suspecté comme cause.\n" +
                        " Calcium : pour détecter une éventuelle hypo- ou hyperparathyroïdie.\n" +
                        " Niveaux de digoxine : pour la toxicité de la digoxine.\n" +
                        " Tomodensitométrie : examen invariablement en milieu hospitalier en cas de confusion aiguë : peut révéler une lésion, une hémorragie ou un infarctus occupant de l'espace.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("La clé de la prise en charge consiste à établir que la confusion est vraiment aiguë plutôt qu'une détérioration progressive de la cognition. Cela nécessite une anamnèse minutieuse de la part de quelqu'un qui connaît bien le patient.\n" +
                        "  N'oubliez pas les antécédents médicamenteux : si peu d'informations sont disponibles lors d'une visite, vérifiez l'armoire à médicaments du patient.\n" +
                        "  Dans les états confusionnels aigus, il peut être difficile d'obtenir des indications cliniques utiles à partir de l'histoire du patient. L'examen prend donc plus d'importance que d'habitude.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Il est pratiquement impossible de parvenir à un diagnostic ferme et de traiter en toute sécurité à la maison. Soyez très sûr de vous si vous choisissez de ne pas l'admettre.\n" +
                        "  La cyanose centrale est un signe inquiétant. Donnez de l'oxygène, si possible, et composez le 999.\n" +
                        "  Chez un diabétique sous traitement, vérifiez toujours la glycémie – rappelez-vous que l'hypoglycémie peut entraîner une confusion avec des signes neurologiques, imitant un AVC.\n" +
                        "  Des réponses physiologiques altérées chez les personnes âgées peuvent entraîner un pouls et une température normaux même en présence d'une infection importante. Ne soyez pas induit en erreur par cela.\n" +
                        "  Demandez si d'autres membres du ménage ont été malades - une intoxication au monoxyde de carbone pourrait également affecter d'autres personnes.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Există sute de posibile cauze individuale de confuzie. Pacienții cu confuzie acută sunt de obicei vârstnici și adesea prezenți în afara orelor de program printr-un apel de la o rudă sau un vecin anxios. Demența constituie stările confuzionale cronice, care nu sunt luate în considerare aici.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  hipoxie (respiratorie si cardiaca)\n" +
                        "  infecție sistemică\n" +
                        "  accident cerebrovascular (ACV: accident vascular cerebral și atac ischemic tranzitoriu (AIT))\n" +
                        "  hipoglicemie\n" +
                        "  cetoacidoza diabetica (DKA)\n" +
                        "OCAZIONAL\n" +
                        "  retragerea alcoolului sau intoxicația\n" +
                        "  infecție cerebrală\n" +
                        "  dezechilibru electrolitic și uremie\n" +
                        "  iatrogen (de exemplu, digoxină, diuretice, steroizi și opiacee)\n" +
                        "  mixoedem\n" +
                        "  abuzul de droguri\n" +
                        "RAR\n" +
                        "  encefalopatia lui Wernicke\n" +
                        "  tumora cerebrala\n" +
                        "  hipo- și hiperparatiroidism\n" +
                        "  boala Cushing\n" +
                        "  stare postictală\n" +
                        "  intoxicare cu monoxid de carbon");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("Confuzia acută are atât de multe cauze și posibile prezentări încât este dificil să se ofere un ghid definitiv de investigații pentru medicul de familie. O serie de investigații ar putea fi luate în considerare în funcție de tabloul clinic și de circumstanțele sociale; în majoritatea cazurilor, totuși, pacientul va fi internat și, prin urmare, vor fi aranjate analizele necesare de către spital.\n" +
                        "PROBABIL: analize de urină, zahăr din sânge (de obicei glucometru), pulsoximetrie.\n" +
                        "POSIBIL: FBC, CXR, ECG, enzime cardiace, TFT.\n" +
                        "MILTRA MICI: calciu, niveluri de digoxină, tomografie computerizată.\n" +
                        " Analiza urinei este de mare ajutor dacă este posibil: căutați glucoză și cetone (DKA), greutate specifică (deshidratare), puroi, sânge și nitriți în ITU. Cetone singure în inaniție și posibil hipoglicemie.\n" +
                        " O citire a glicemiei este mai practică decât o glicemie formală în situația acută pentru a diagnostica hipoglicemia și hiperglicemia.\n" +
                        " Pulsoximetrie: pentru a detecta hipoxia.\n" +
                        " FBC: WCC crescut în infecții. Indicator util MCV ridicat pentru excesul de alcool și mixoedem.\n" +
                        " U&E important, mai ales dacă există semne de deshidratare sau de diuretice.\n" +
                        " LFT și TFT: alcoolul, malignitatea diseminată și hipotiroidismul trebuie întotdeauna luate în considerare.\n" +
                        " CXR: poate dezvălui o cauză a hipoxemiei (de exemplu, pneumonie, insuficiență cardiacă).\n" +
                        " ECG, enzime cardiace: dacă infarct silențios este suspectat ca cauză.\n" +
                        " Calciu: pentru a detecta posibile hipo- sau hiperparatiroidism.\n" +
                        " Niveluri de digoxină: pentru toxicitatea digoxinei.\n" +
                        " CT: invariabil o investigație spitalicească în confuzie acută: poate evidenția leziuni ocupatoare de spațiu, sângerare sau infarct.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Cheia managementului constă în stabilirea faptului că confuzia este cu adevărat acută, mai degrabă decât o deteriorare treptată a cogniției. Acest lucru necesită o anamneză atentă de la cineva care cunoaște bine pacientul.\n" +
                        "  Nu uitați de istoricul medicamentelor: dacă sunt puține informații disponibile la o vizită, verificați dulapul cu medicamente al pacientului.\n" +
                        "  În stările de confuzie acute, poate fi dificil să se obțină indicații clinice utile din istoricul pacientului. Prin urmare, examenul capătă o importanță mai mare decât de obicei.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Este practic imposibil să ajungi la un diagnostic ferm și să tratezi în siguranță la domiciliu. Fii foarte sigur pe tine dacă alegi să nu recunoști.\n" +
                        "  Cianoza centrală este un semn de rău augur. Dați oxigen, dacă este posibil, și formați 999.\n" +
                        "  La un diabetic aflat în tratament, verificați întotdeauna glicemia – amintiți-vă că hipoglicemia poate produce confuzie cu semne neurologice, mimând un CVA.\n" +
                        "  Răspunsurile fiziologice modificate la vârstnici pot duce la un puls și o temperatură normale chiar și în prezența unei infecții semnificative. Nu vă lăsați induși în eroare de acest lucru.\n" +
                        "  Întrebați dacă alți membri ai gospodăriei nu s-au simțit bine – otrăvirea cu monoxid de carbon i-ar putea afecta și pe alții.");
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