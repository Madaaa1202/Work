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

public class AfectiuniAbdomenConstipation extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_constipation);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune4);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune4);

        if(textView.getText().toString().equals("Verstopfung")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Constipation"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Constipation"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Constipație"))
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
                textView2.setText("Constipation is defined as the infrequent or difficult evacuation of faeces. One study of a large normal working population showed variation in frequency from three times a day to three times a week. The average GP will see about 18 presentations of constipation each year. In most cases, there is a combination of aetiological factors, and serious causes are rare. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " diet and lifestyle (inadequate fi bre and ignoring the urge to defecate)\n" +
                        " inactivity (especially in the elderly)\n" +
                        " irritable bowel syndrome (IBS)\n" +
                        " painful perianal conditions: fi ssure, haemorrhoids, abscess, florid warts\n" +
                        " drugs, e.g. opiates, iron, aluminium hydroxide\n" +
                        "OCCASIONAL\n" +
                        " poor fluid intake\n" +
                        " acquired megacolon, e.g. chronic laxative abuse, neurological problems, scleroderma\n" +
                        " diverticulosis (with or without stricture)\n" +
                        " hypothyroidism\n" +
                        " carcinoma of rectum or colon\n" +
                        "RARE\n" +
                        " pressure from extracolonic pelvic masses\n" +
                        " acute bowel obstruction (various causes)\n" +
                        " hypercalcaemia\n" +
                        " Crohn’s disease with stricture \n" +
                        "infants and children: behavioural (‘stool holding’), Hirschsprung’s disease");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none; if suspicion of signifi cant underlying bowel pathology, then FBC, barium enema and sigmoidoscopy/colonoscopy (radiology and endoscopy usually arranged in secondary care).\n" +
                        "POSSIBLE: urinalysis, thyroid function tests (TFT).\n" +
                        "SMALL PRINT: plain abdominal X-ray, serum calcium, ultrasound, CT scan, biopsy.\n" +
                        " Urinalysis: specifi c gravity high if inadequate fl uid intake.\n" +
                        " FBC: may reveal iron defi ciency anaemia if underlying carcinoma.\n" +
                        " TFT and serum calcium: will reveal hypothyroidism or hypercalcaemia.\n" +
                        " Plain abdominal X-ray: may reveal megacolon full of faeces; erect and supine views will show obstruction.\n" +
                        " Barium enema, sigmoidoscopy, colonoscopy: may reveal carcinoma or diverticular disease.\n" +
                        " Ultrasound/CT scan: may be helpful if a pelvic mass is present.\n" +
                        " Biopsy: of suspicious lesions or to confi rm Hirschsprung’s disease. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText(" Clarify what patients mean by constipation: they oft en use the term inaccurately (e.g. in reference to a perfectly ‘normal’ bowel habit or to describe another symptom such as tenesmus).\n" +
                        " Th e longer the history, the less likely there is to be any underlying or remediable cause.\n" +
                        " Check the medication history (including over-the-counter treatment): just about any medication can alter the bowel habit.\n" +
                        " Look at the patient: your immediate impression may give important clues to the underlying diagnosis (e.g. hypothyroidism or weight loss in malignancy). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("Constipation alone in the elderly is rarely caused by sinister pathology – but if it is accompanied by other signifi cant symptoms, such as weight loss, rectal bleeding or mucus, or diarrhoea, carcinoma is likely.\n" +
                        " Beware of attributing abdominal pain to constipation – the true diagnosis might be intestinal obstruction. Visible peristalsis with audible borborygmi is never due to simple constipation.\n" +
                        " Cases of Hirschsprung’s disease can present ‘late’ – consider the diagnosis in a child with chronic constipation, a persistently swollen abdomen and an empty rectum.\n" +
                        " Beware of assuming that known pathology (such as diverticular disease or IBS) in an individual is the cause of constipation. If the patient has presented with constipation, then there may have been a signifi cant change in the pattern or the nature of the symptoms.");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Verstopfung ist definiert als die seltene oder schwierige Entleerung von Kot. Eine Studie mit einer großen, normal arbeitenden Bevölkerung zeigte eine Variation der Häufigkeit von dreimal täglich bis dreimal wöchentlich. Der durchschnittliche Hausarzt wird jedes Jahr etwa 18 Anzeichen von Verstopfung sehen. In den meisten Fällen liegt eine Kombination verschiedener ätiologischer Faktoren vor, schwerwiegende Ursachen sind selten.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  Ernährung und Lebensstil (zu wenig Ballaststoffe und Ignorieren des Stuhldrangs)\n" +
                        "  Inaktivität (insbesondere bei älteren Menschen)\n" +
                        "  Reizdarmsyndrom (IBS)\n" +
                        "  schmerzhafte perianale Zustände: Fissur, Hämorrhoiden, Abszess, blumige Warzen\n" +
                        "  Drogen, z. Opiate, Eisen, Aluminiumhydroxid\n" +
                        "GELEGENTLICH\n" +
                        "  schlechte Flüssigkeitsaufnahme\n" +
                        "  erworbener Megakolon, z.B. chronischer Abführmittelmissbrauch, neurologische Probleme, Sklerodermie\n" +
                        "  Divertikulose (mit oder ohne Striktur)\n" +
                        "  Hypothyreose\n" +
                        "  Karzinom des Rektums oder Dickdarms\n" +
                        "SELTEN\n" +
                        "  Druck von extrakolonischen Beckenmassen\n" +
                        "  akuter Darmverschluss (verschiedene Ursachen)\n" +
                        "  Hyperkalzämie\n" +
                        "  Morbus Crohn mit Striktur\n" +
                        "Säuglinge und Kinder: Verhaltensstörungen („Stuhlhalten“), Morbus Hirschsprung");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine; bei Verdacht auf eine signifikante zugrunde liegende Darmpathologie, dann FBC, Bariumeinlauf und Sigmoidoskopie/Koloskopie (Radiologie und Endoskopie in der Regel in der Sekundärversorgung angeordnet).\n" +
                        "MÖGLICH: Urinanalyse, Schilddrüsenfunktionstests (TFT).\n" +
                        "KLEINDRUCK: Röntgenaufnahme des Abdomens, Serumkalzium, Ultraschall, CT-Scan, Biopsie.\n" +
                        "  Urinanalyse: Spezifisches Gewicht hoch bei unzureichender Flüssigkeitsaufnahme.\n" +
                        "  FBC: kann eine Eisenmangelanämie zeigen, wenn ein zugrunde liegendes Karzinom vorliegt.\n" +
                        "  TFT und Serumkalzium: zeigen Hypothyreose oder Hyperkalzämie an.\n" +
                        "  Einfaches Röntgenbild des Abdomens: Kann Megakolon voller Kot zeigen; Blicke in aufrechter und liegender Position zeigen eine Obstruktion.\n" +
                        "  Bariumeinlauf, Sigmoidoskopie, Koloskopie: Kann ein Karzinom oder eine Divertikelerkrankung aufzeigen.\n" +
                        "  Ultraschall/CT-Scan: kann hilfreich sein, wenn eine Beckenmasse vorhanden ist.\n" +
                        "  Biopsie: bei verdächtigen Läsionen oder zur Bestätigung der Hirschsprung-Krankheit.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Klären Sie, was Patienten unter Verstopfung verstehen: Sie verwenden den Begriff oft ungenau (z. B. in Bezug auf einen völlig „normalen“ Stuhlgang oder um ein anderes Symptom wie Tenesmus zu beschreiben).\n" +
                        "  Je länger die Vorgeschichte, desto unwahrscheinlicher ist es, dass es eine zugrunde liegende oder behebbare Ursache gibt.\n" +
                        "  Überprüfen Sie die Medikamentenanamnese (einschließlich rezeptfreier Behandlungen): Nahezu jedes Medikament kann die Stuhlgewohnheiten verändern.\n" +
                        "  Sehen Sie sich den Patienten an: Ihr unmittelbarer Eindruck kann wichtige Hinweise auf die zugrunde liegende Diagnose geben (z. B. Hypothyreose oder Gewichtsverlust bei Malignität).");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Verstopfung allein bei älteren Menschen wird selten durch eine finstere Pathologie verursacht – aber wenn sie von anderen signifikanten Symptomen wie Gewichtsverlust, rektalen Blutungen oder Schleim oder Durchfall begleitet wird, ist ein Karzinom wahrscheinlich.\n" +
                        "  Hüten Sie sich davor, Bauchschmerzen einer Verstopfung zuzuschreiben – die wahre Diagnose könnte ein Darmverschluss sein. Eine sichtbare Peristaltik mit hörbarem Borborygmi ist niemals auf eine einfache Obstipation zurückzuführen.\n" +
                        "  Fälle von Morbus Hirschsprung können „spät“ auftreten – ziehen Sie die Diagnose bei einem Kind mit chronischer Verstopfung, einem anhaltend geschwollenen Bauch und einem leeren Rektum in Betracht.\n" +
                        "  Hüten Sie sich vor der Annahme, dass eine bekannte Pathologie (wie Divertikulose oder Reizdarmsyndrom) bei einer Person die Ursache für Verstopfung ist. Wenn der Patient unter Verstopfung leidet, kann es zu einer signifikanten Veränderung des Musters oder der Art der Symptome gekommen sein.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("La constipation est définie comme l'évacuation peu fréquente ou difficile des matières fécales. Une étude portant sur une importante population active normale a montré une variation de la fréquence de trois fois par jour à trois fois par semaine. Le généraliste moyen verra environ 18 présentations de constipation chaque année. Dans la plupart des cas, il existe une association de facteurs étiologiques et les causes graves sont rares.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  régime alimentaire et mode de vie (fi bres inadéquates et ignorance de l'envie de déféquer)\n" +
                        "  inactivité (en particulier chez les personnes âgées)\n" +
                        "  syndrome du côlon irritable (IBS)\n" +
                        "  affections périanales douloureuses : fissurations, hémorroïdes, abcès, verrues florides\n" +
                        "  médicaments, par ex. opiacés, fer, hydroxyde d'aluminium\n" +
                        "OCCASIONNEL\n" +
                        "  mauvaise consommation de liquide\n" +
                        "  mégacôlon acquis, par ex. abus chronique de laxatifs, problèmes neurologiques, sclérodermie\n" +
                        "  diverticulose (avec ou sans sténose)\n" +
                        "  hypothyroïdie\n" +
                        "  carcinome du rectum ou du côlon\n" +
                        "RARE\n" +
                        "  pression des masses pelviennes extracoliques\n" +
                        "  occlusion intestinale aiguë (causes diverses)\n" +
                        "  hypercalcémie\n" +
                        "  Maladie de Crohn avec sténose\n" +
                        "nourrissons et enfants : comportemental (« tenue des selles »), maladie de Hirschsprung");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun ; si suspicion de pathologie intestinale sous-jacente significative, alors FBC, lavement baryté et sigmoïdoscopie/coloscopie (radiologie et endoscopie généralement organisées en soins secondaires).\n" +
                        "POSSIBLE : analyse d'urine, tests de la fonction thyroïdienne (TFT).\n" +
                        "PETITS CARACTÈRES : radiographie abdominale simple, calcium sérique, échographie, tomodensitométrie, biopsie.\n" +
                        "  Analyse d'urine : gravité spécifique élevée si apport hydrique insuffisant.\n" +
                        "  FBC : peut révéler une anémie ferriprive si carcinome sous-jacent.\n" +
                        "  TFT et calcium sérique : révéleront une hypothyroïdie ou une hypercalcémie.\n" +
                        "  Radiographie abdominale simple : peut révéler un mégacôlon plein de matières fécales ; les vues en érection et en décubitus montreront une obstruction.\n" +
                        "  Lavement baryté, sigmoïdoscopie, coloscopie : peuvent révéler un carcinome ou une maladie diverticulaire.\n" +
                        "  Échographie/TDM : peut être utile si une masse pelvienne est présente.\n" +
                        "  Biopsie : de lésions suspectes ou pour confi rmer la maladie de Hirschsprung.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Clarifiez ce que les patients entendent par constipation : ils utilisent souvent le terme de manière inexacte (par exemple, en référence à une selle parfaitement « normale » ou pour décrire un autre symptôme tel que le ténesme).\n" +
                        "  Plus l'histoire est longue, moins il y a de chances qu'il y ait une cause sous-jacente ou remédiable.\n" +
                        "  Vérifiez l'historique des médicaments (y compris les traitements en vente libre) : à peu près n'importe quel médicament peut modifier les habitudes intestinales.\n" +
                        "  Regardez le patient : votre impression immédiate peut donner des indices importants sur le diagnostic sous-jacent (par exemple, hypothyroïdie ou perte de poids dans une tumeur maligne).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La constipation seule chez les personnes âgées est rarement causée par une pathologie sinistre - mais si elle s'accompagne d'autres symptômes importants, tels qu'une perte de poids, des saignements rectaux ou du mucus, ou une diarrhée, un carcinome est probable.\n" +
                        "  Méfiez-vous d'attribuer des douleurs abdominales à la constipation - le vrai diagnostic pourrait être une occlusion intestinale. Le péristaltisme visible avec borborygmes audibles n'est jamais dû à une simple constipation.\n" +
                        "  Les cas de la maladie de Hirschsprung peuvent se présenter « tardivement » – considérez le diagnostic chez un enfant souffrant de constipation chronique, d'un abdomen constamment enflé et d'un rectum vide.\n" +
                        "  Méfiez-vous de supposer qu'une pathologie connue (telle que la maladie diverticulaire ou IBS) chez un individu est la cause de la constipation. Si le patient s'est présenté avec de la constipation, il se peut qu'il y ait eu un changement significatif dans le schéma ou la nature des symptômes.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Constipația este definită ca evacuarea nefrecventă sau dificilă a fecalelor. Un studiu pe o populație normală mare de muncă a arătat variații în frecvență de la trei ori pe zi la trei ori pe săptămână. Medicul de familie va vedea aproximativ 18 prezentări de constipație în fiecare an. În cele mai multe cazuri, există o combinație de factori etiologici, iar cauzele grave sunt rare.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  dieta și stilul de viață (fibre inadecvate și ignorarea nevoii de a face nevoile)\n" +
                        "  inactivitate (mai ales la vârstnici)\n" +
                        "  sindromul colonului iritabil (IBS)\n" +
                        "  afecțiuni perianale dureroase: fisuri, hemoroizi, abcese, veruci flori\n" +
                        "  droguri, de ex. opiacee, fier, hidroxid de aluminiu\n" +
                        "OCAZIONAL\n" +
                        "  aport slab de lichide\n" +
                        "  megacolon dobândit, de ex. abuz cronic de laxative, probleme neurologice, sclerodermie\n" +
                        "  diverticuloza (cu sau fara stricturi)\n" +
                        "  hipotiroidism\n" +
                        "  carcinom de rect sau de colon\n" +
                        "RAR\n" +
                        "  presiunea din masele pelvine extracolonice\n" +
                        "  obstrucție intestinală acută (diverse cauze)\n" +
                        "  hipercalcemie\n" +
                        "  boala Crohn cu stricturi\n" +
                        "sugari și copii: comportamentală („ținerea scaunului”), boala Hirschsprung");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul; în cazul suspiciunii de patologie intestinală subiacentă semnificativă, atunci FBC, clisma de bariu și sigmoidoscopie/colonoscopie (radiologie și endoscopie aranjate de obicei în asistență secundară).\n" +
                        "POSIBIL: analize de urină, teste ale funcției tiroidiene (TFT).\n" +
                        "TIPOARE MICI: radiografie abdominală simplă, calciu seric, ecografie, tomografie computerizată, biopsie.\n" +
                        "  Analiza urinei: greutate specifică mare dacă aportul de lichid este inadecvat.\n" +
                        "  FBC: poate dezvălui anemie cu deficit de fier dacă este subiacent carcinom.\n" +
                        "  TFT și calciul seric: vor dezvălui hipotiroidism sau hipercalcemie.\n" +
                        "  Radiografia abdominală simplă: poate dezvălui megacolon plin de fecale; Vederile erecte și în decubit dorsal vor arăta obstrucție.\n" +
                        "  Clismă cu bariu, sigmoidoscopie, colonoscopie: poate evidenția carcinom sau boală diverticulară.\n" +
                        "  Ecografia/CT: poate fi utilă dacă este prezentă o masă pelviană.\n" +
                        "  Biopsie: a leziunilor suspecte sau pentru a confirma boala Hirschsprung.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Clarificați ce înțeleg pacienții prin constipație: ei folosesc adesea termenul în mod incorect (de exemplu, cu referire la un obicei intestinal perfect „normal” sau pentru a descrie un alt simptom, cum ar fi tenesmus).\n" +
                        "  Cu cât istoricul este mai lung, cu atât este mai puțin probabil să existe vreo cauză subiacentă sau remediabilă.\n" +
                        "  Verificați istoricul medicației (inclusiv tratamentul fără prescripție medicală): aproape orice medicament poate modifica obiceiul intestinal.\n" +
                        "  Privește pacientul: impresia ta imediată poate oferi indicii importante pentru diagnosticul de bază (de exemplu, hipotiroidie sau scădere în greutate în cazul malignității).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Constipația singură la vârstnici este rareori cauzată de o patologie sinistră – dar dacă este însoțită de alte simptome semnificative, cum ar fi scăderea în greutate, sângerare rectală sau mucus sau diaree, este probabil un carcinom.\n" +
                        "  Feriți-vă să atribuiți durerea abdominală constipației – adevăratul diagnostic ar putea fi obstrucția intestinală. Peristaltismul vizibil cu borborigmi audibili nu se datorează niciodată unei simple constipații.\n" +
                        "  Cazurile de boală Hirschsprung se pot prezenta „târzie” – luați în considerare diagnosticul la un copil cu constipație cronică, abdomen umflat persistent și rect gol.\n" +
                        "  Feriți-vă de a presupune că patologia cunoscută (cum ar fi boala diverticulară sau IBS) la un individ este cauza constipației. Dacă pacientul a prezentat constipație, atunci este posibil să fi existat o schimbare semnificativă a modelului sau a naturii simptomelor.");
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