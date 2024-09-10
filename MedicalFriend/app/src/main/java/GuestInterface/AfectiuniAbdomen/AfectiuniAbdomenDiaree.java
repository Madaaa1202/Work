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

public class AfectiuniAbdomenDiaree extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afectiuni_abdomen_diaree);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiune5);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiune5);

        if(textView.getText().toString().equals("Durchfall")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Diarrhoea"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Diarrhée"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Diaree"))
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
                textView2.setText("Diarrhoea is the passage of abnormally liquid and frequent stools. It is said to be chronic if it lasts more than 2 weeks. It is the fi ft h-commonest presenting symptom in general practice. Patients will use the term ‘diarrhoea’ when presenting, but they may just mean frequent stools. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " acute infective gastroenteritis, e.g. rotavirus, campylobacter, food poisoning\n" +
                        " antibiotics (and other drug side eff ects)\n" +
                        " irritable bowel syndrome (IBS)\n" +
                        " diverticulitis\n" +
                        " overfl ow constipation (especially in the elderly)\n" +
                        "OCCASIONAL\n" +
                        " lactose intolerance\n" +
                        " chronic infection: amoebiasis, giardiasis, hookworm\n" +
                        " bowel neoplasia\n" +
                        " infl ammatory bowel disease (IBD): ulcerative colitis and Crohn’s disease\n" +
                        " excess alcohol\n" +
                        " toddler diarrhoea\n" +
                        " coeliac disease (1 in 300)\n" +
                        "RARE\n" +
                        " appendicitis\n" +
                        " laxative misuse\n" +
                        " thyrotoxicosis\n" +
                        " malabsorption, e.g. coeliac disease\n" +
                        " allergy\n" +
                        " ovarian cancer");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: if persistent, stool specimen, FBC, ESR/CRP, TFT, anti-endomysial and anti-gliadin antibodies, faecal calprotectin.\n" +
                        "POSSIBLE: urinalysis, LFT, proctosopy/sigmoidoscopy followed by barium enema, colonoscopy, CA-125.\n" +
                        "SMALL PRINT: tests for malabsorption.\n" +
                        " One stool sample is suffi cient in acute diarrhoea of more than a week to look for common infections. Follow-up needed to show clearance of salmonella.\n" +
                        " Series of three daily stool samples necessary to look for ova, cysts and parasites in chronic diarrhoea.\n" +
                        " FBC: Hb may be reduced and ESR/CRP elevated in IBD and malignancy; iron defi ciency anaemia in neoplasia, coeliac disease; diverticulitis – check ferritin, B12 and folate too; WCC raised in IBD and infection.\n" +
                        " TFT: will reveal thyrotoxicosis.\n" +
                        " Anti-endomysial and anti-gliadin antibodies: suggest coeliac disease if positive.\n" +
                        " Faecal calprotectin: helps rule out infl ammatory bowel disease.\n" +
                        " LFT: may suggest secondaries or alcoholism.\n" +
                        " Urinalysis: specifi c gravity high in dehydration.\n" +
                        " Proctoscopy/sigmoidoscopy followed by barium enema or colonoscopy (usually arranged by the specialist): will confirm diagnosis of malignancy, diverticulosis, carcinoma and IBD.\n" +
                        " CA-125: to help exclude ovarian cancer – especially in women aged 50 or more.\n" +
                        " Tests for malabsorption: such as stool fat analysis, lactose tolerance test, small intestinal biopsy (all secondary care). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Clarify what patients mean by diarrhoea – they may be referring simply to a minor change in their normal habit or the frequent passage of normal stools.\n" +
                        " Giardiasis is much more common than previously thought and may be diffi cult to isolate in stool specimens. Empirical treatment is justifi ed if the clinical picture is suggestive (recent onset aft er travel of persistent fatty diarrhoea with anorexia, nausea and bloating).\n" +
                        "IBS rarely causes nocturnal diarrhoea.\n" +
                        " Patients with gastroenteritis should steadily improve aft er a few days, but may experience symptoms for up to 10 days – warn them of this.\n" +
                        " Do not be caught out by overfl ow diarrhoea in the elderly. Th e only way to establish this diagnosis is with a PR.\n" +
                        " Remember to ask about foreign travel and occupation, which have implications for diagnostic possibilities and management. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText("Weight loss in chronic diarrhoea is highly suggestive of signifi cant pathology.\n" +
                        " In a young and otherwise well person, it is reasonable to make a positive clinical diagnosis of irritable bowel syndrome with minimal investigation – but beware of making this diagnosis for the fi rst time in the middle-aged and elderly. Signifi cant pathology mimicking IBS is\n" +
                        "likely.\n" +
                        " Carefully assess hydration in infants and the elderly with diarrhoea; if there are signs of dehydration, always admit to hospital.\n" +
                        " Initial telephone consultation is suffi cient for most cases of acute diarrhoea, but if in constant (not colicky) abdominal pain, always see and examine to exclude an acute surgical condition.\n" +
                        " Remember that acute diarrhoea in the elderly can precipitate or aggravate renal failure – especially if they are on ACE inhibitors. Stop these drugs for the duration of the illness and ensure adequate hydration");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Durchfall ist der Durchgang von ungewöhnlich flüssigen und häufigen Stühlen. Dauert sie länger als 2 Wochen, spricht man von einer chronischen Erkrankung. Es ist das fünfthäufigste Symptom in der Allgemeinmedizin. Die Patienten verwenden bei der Vorstellung den Begriff „Durchfall“, aber sie meinen möglicherweise nur häufigen Stuhlgang.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  akute infektiöse Gastroenteritis, z. Rotavirus, Campylobacter, Lebensmittelvergiftung\n" +
                        "  Antibiotika (und andere Arzneimittelnebenwirkungen)\n" +
                        "  Reizdarmsyndrom (IBS)\n" +
                        "  Divertikulitis\n" +
                        "  Verstopfung (insbesondere bei älteren Menschen)\n" +
                        "GELEGENTLICH\n" +
                        "  Laktoseintoleranz\n" +
                        "  chronische Infektion: Amöbiasis, Giardiasis, Hakenwurm\n" +
                        "  Darm Neoplasie\n" +
                        "  entzündliche Darmerkrankung (IBD): Colitis ulcerosa und Morbus Crohn\n" +
                        "  überschüssiger Alkohol\n" +
                        "  Kleinkinder Durchfall\n" +
                        "  Zöliakie (1 von 300)\n" +
                        "SELTEN\n" +
                        "  Appendizitis\n" +
                        "  Missbrauch von Abführmitteln\n" +
                        "  Thyreotoxikose\n" +
                        "  Malabsorption, z.B. Zöliakie\n" +
                        "  Allergie\n" +
                        "  Ovarialkarzinom");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: wenn persistierend, Stuhlprobe, FBC, ESR/CRP, TFT, Anti-Endomysium- und Anti-Gliadin-Antikörper, fäkales Calprotectin.\n" +
                        "MÖGLICH: Urinanalyse, LFT, Proktosopie/Sigmoidoskopie mit anschließendem Bariumeinlauf, Koloskopie, CA-125.\n" +
                        "KLEINDRUCK: Test auf Malabsorption.\n" +
                        " Bei akutem Durchfall von mehr als einer Woche reicht eine Stuhlprobe aus, um nach häufigen Infektionen zu suchen. Follow-up erforderlich, um die Beseitigung von Salmonellen zu zeigen.\n" +
                        " Serie von drei täglichen Stuhlproben zur Suche nach Eizellen, Zysten und Parasiten bei chronischem Durchfall.\n" +
                        " FBC: Hb kann reduziert und ESR/CRP erhöht sein bei IBD und Malignität; Eisenmangelanämie bei Neoplasie, Zöliakie; Divertikulitis – überprüfen Sie auch Ferritin, B12 und Folsäure; WCC bei CED und Infektionen angesprochen.\n" +
                        " TFT: zeigt Thyreotoxikose.\n" +
                        " Anti-Endomysial- und Anti-Gliadin-Antikörper: deuten auf Zöliakie hin, wenn positiv.\n" +
                        " Fäkales Calprotectin: Hilft, entzündliche Darmerkrankungen auszuschließen.\n" +
                        " LFT: kann auf Sekundärerkrankungen oder Alkoholismus hindeuten.\n" +
                        " Urinanalyse: Spezifisches Gewicht hoch bei Austrocknung.\n" +
                        " Proktoskopie/Sigmoidoskopie, gefolgt von einem Bariumeinlauf oder einer Koloskopie (in der Regel vom Spezialisten angeordnet): bestätigt die Diagnose von Malignität, Divertikulose, Karzinom und CED.\n" +
                        " CA-125: hilft beim Ausschluss von Eierstockkrebs – insbesondere bei Frauen ab 50 Jahren.\n" +
                        " Tests auf Malabsorption: wie Stuhlfettanalyse, Laktosetoleranztest, Dünndarmbiopsie (alle Sekundärversorgung).");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Klären Sie, was Patienten mit Durchfall meinen – sie beziehen sich möglicherweise einfach auf eine geringfügige Änderung ihrer normalen Gewohnheiten oder den häufigen normalen Stuhlgang.\n" +
                        "  Giardiasis ist viel häufiger als bisher angenommen und kann in Stuhlproben schwer zu isolieren sein. Eine empirische Behandlung ist gerechtfertigt, wenn das klinische Bild darauf hindeutet (kürzlich nach der Reise aufgetretener anhaltender fettiger Durchfall mit Anorexie, Übelkeit und Blähungen).\n" +
                        "IBS verursacht selten nächtlichen Durchfall.\n" +
                        "  Patienten mit Gastroenteritis sollten sich nach einigen Tagen stetig bessern, können aber bis zu 10 Tage lang Symptome haben – warnen Sie sie davor.\n" +
                        "  Lassen Sie sich bei älteren Menschen nicht von Überlaufdurchfall überraschen. Die einzige Möglichkeit, diese Diagnose zu stellen, ist eine PR.\n" +
                        "  Denken Sie daran, nach Auslandsreisen und -berufen zu fragen, die Auswirkungen auf die diagnostischen Möglichkeiten und das Management haben.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Der Gewichtsverlust bei chronischer Diarrhoe weist stark auf eine signifikante Pathologie hin.\n" +
                        "  Bei einer jungen und ansonsten gesunden Person ist es vernünftig, mit minimalen Untersuchungen eine positive klinische Diagnose des Reizdarmsyndroms zu stellen – aber Vorsicht, diese Diagnose bei Menschen mittleren Alters und älteren Menschen zum ersten Mal zu stellen. Signifikante Pathologie, die IBS nachahmt, ist\n" +
                        "wahrscheinlich.\n" +
                        "  Beurteilen Sie die Flüssigkeitszufuhr bei Säuglingen und älteren Menschen mit Durchfall sorgfältig; Bei Anzeichen von Dehydration immer ins Krankenhaus einweisen.\n" +
                        "  Bei akutem Durchfall ist in den meisten Fällen eine telefonische Erstberatung ausreichend, bei anhaltenden (nicht kolikartigen) Bauchschmerzen jedoch immer zum Ausschluss eines akuten chirurgischen Eingriffs sehen und untersuchen.\n" +
                        "  Denken Sie daran, dass akuter Durchfall bei älteren Menschen ein Nierenversagen auslösen oder verschlimmern kann – insbesondere, wenn sie ACE-Hemmer einnehmen. Setzen Sie diese Medikamente für die Dauer der Krankheit ab und sorgen Sie für eine ausreichende Flüssigkeitszufuhr");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("La diarrhée est le passage de selles anormalement liquides et fréquentes. Elle est dite chronique si elle dure plus de 2 semaines. C'est le cinquième symptôme le plus fréquent en médecine générale. Les patients utiliseront le terme «diarrhée» lors de la présentation, mais ils peuvent simplement signifier des selles fréquentes.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  gastro-entérite infectieuse aiguë, par ex. rotavirus, campylobacter, intoxication alimentaire\n" +
                        "  antibiotiques (et autres effets secondaires des médicaments)\n" +
                        "  syndrome du côlon irritable (IBS)\n" +
                        "  diverticulite\n" +
                        "  constipation excessive (en particulier chez les personnes âgées)\n" +
                        "OCCASIONNEL\n" +
                        "  Intolérance au lactose\n" +
                        "  infection chronique : amibiase, giardiase, ankylostome\n" +
                        "  néoplasie intestinale\n" +
                        "  maladie inflammatoire de l'intestin (MII) : colite ulcéreuse et maladie de Crohn\n" +
                        "  excès d'alcool\n" +
                        "  diarrhée du tout-petit\n" +
                        "  maladie coeliaque (1 sur 300)\n" +
                        "RARE\n" +
                        "  appendicite\n" +
                        "  mésusage de laxatif\n" +
                        "  thyréotoxicose\n" +
                        "  malabsorption, par ex. la maladie coeliaque\n" +
                        "  allergie\n" +
                        "  cancer des ovaires");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE: si persistant, échantillon de selles, FBC, ESR/CRP, TFT, anticorps anti-endomysium et anti-gliadine, calprotectine fécale.\n" +
                        "POSSIBLE: analyse d'urine, LFT, rectoscopie/sigmoïdoscopie suivie d'un lavement baryté, coloscopie, CA-125.\n" +
                        "PETITS CARACTÈRES: tests de malabsorption.\n" +
                        " Un échantillon de selles suffit en cas de diarrhée aiguë de plus d'une semaine pour rechercher des infections courantes. Suivi nécessaire pour montrer l'élimination de la salmonelle.\n" +
                        " Série de trois prélèvements quotidiens de selles nécessaires à la recherche d'ovules, de kystes et de parasites dans les diarrhées chroniques.\n" +
                        " FBC: l'Hb peut être réduite et la VS/CRP élevée dans les MICI et les tumeurs malignes; anémie ferriprive dans la néoplasie, la maladie coeliaque; diverticulite – vérifiez également la ferritine, la vitamine B12 et l'acide folique ; WCC élevé dans les MICI et l'infection.\n" +
                        " TFT: révélera une thyrotoxicose.\n" +
                        " Anticorps anti-endomysium et anti-gliadine : suggérer une maladie coeliaque si positif.\n" +
                        " Calprotectine fécale : aide à éliminer les maladies inflammatoires de l'intestin.\n" +
                        " LFT: peut suggérer des secondaires ou de l'alcoolisme.\n" +
                        " Analyse d'urine : densité élevée en cas de déshydratation.\n" +
                        " Rectoscopie/sigmoïdoscopie suivie d'un lavement baryté ou d'une coloscopie (généralement organisée par le spécialiste) : confirmera le diagnostic de malignité, de diverticulose, de carcinome et de MICI.\n" +
                        " CA-125: pour aider à exclure le cancer de l'ovaire, en particulier chez les femmes de 50ans ou plus.\n" +
                        " Tests de malabsorption: tels que l'analyse des graisses dans les selles, le test de tolérance au lactose, la biopsie de l'intestin grêle (tous les soins secondaires).");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Clarifiez ce que les patients entendent par diarrhée – ils peuvent se référer simplement à un changement mineur de leurs habitudes normales ou au passage fréquent de selles normales.\n" +
                        "  La giardiase est beaucoup plus fréquente qu'on ne le pensait auparavant et peut être difficile à isoler dans les échantillons de selles. Un traitement empirique est justifié si le tableau clinique est évocateur (apparition récente après voyage d'une diarrhée grasse persistante avec anorexie, nausées et ballonnements).\n" +
                        "Le SCI provoque rarement une diarrhée nocturne.\n" +
                        "  Les patients atteints de gastro-entérite devraient s'améliorer régulièrement après quelques jours, mais peuvent présenter des symptômes jusqu'à 10 jours - prévenez-les de cela.\n" +
                        "  Ne vous laissez pas surprendre par la diarrhée de débordement chez les personnes âgées. La seule façon d'établir ce diagnostic est avec un PR.\n" +
                        "  N'oubliez pas de poser des questions sur les voyages et la profession à l'étranger, qui ont des implications sur les possibilités de diagnostic et la gestion.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("La perte de poids dans la diarrhée chronique est fortement évocatrice d'une pathologie importante.\n" +
                        "  Chez une personne jeune et par ailleurs en bonne santé, il est raisonnable de poser un diagnostic clinique positif de syndrome du côlon irritable avec un minimum d'investigation - mais méfiez-vous de faire ce diagnostic pour la première fois chez les personnes d'âge moyen et les personnes âgées. Une pathologie significative imitant le SCI est\n" +
                        "probable.\n" +
                        "  Évaluer soigneusement l'hydratation chez les nourrissons et les personnes âgées souffrant de diarrhée ; s'il y a des signes de déshydratation, toujours admettre à l'hôpital.\n" +
                        "  Une consultation téléphonique initiale est suffisante pour la plupart des cas de diarrhée aiguë, mais en cas de douleurs abdominales constantes (pas de coliques), consultez et examinez toujours pour exclure une affection chirurgicale aiguë.\n" +
                        "  N'oubliez pas que la diarrhée aiguë chez les personnes âgées peut précipiter ou aggraver l'insuffisance rénale, surtout si elles prennent des inhibiteurs de l'ECA. Arrêtez ces médicaments pendant toute la durée de la maladie et assurez-vous d'une hydratation adéquate");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Diareea este trecerea unor scaune anormal de lichide și frecvente. Se spune că este cronică dacă durează mai mult de 2 săptămâni. Este cel mai frecvent simptom prezent în practica generală. Pacienții vor folosi termenul „diaree” atunci când se prezintă, dar pot însemna doar scaune frecvente.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  gastroenterita infectioasa acuta, de ex. rotavirus, campylobacter, toxiinfecții alimentare\n" +
                        "  antibiotice (și alte reacții adverse ale medicamentelor)\n" +
                        "  sindromul colonului iritabil (IBS)\n" +
                        "  diverticulita\n" +
                        "  constipație excesivă (mai ales la vârstnici)\n" +
                        "OCAZIONAL\n" +
                        "  intoleranță la lactoză\n" +
                        "  infecție cronică: amebiază, giardioză, vierme\n" +
                        "  neoplazie intestinală\n" +
                        "  boala inflamatorie intestinală (IBD): colită ulceroasă și boala Crohn\n" +
                        "  alcool în exces\n" +
                        "  diareea copilului mic\n" +
                        "  boala celiacă (1 din 300)\n" +
                        "RAR\n" +
                        "  apendicită\n" +
                        "  abuz de laxativ\n" +
                        "  tireotoxicoza\n" +
                        "  malabsorbție, de ex. boala celiacă\n" +
                        "  alergie\n" +
                        "  cancer ovarian");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: dacă persistă, specimen de scaun, FBC, ESR/CRP, TFT, anticorpi anti-endomiziali și anti-gliadină, calprotectină fecală.\n" +
                        "POSIBIL: analiză de urină, LFT, proctosopie/sigmoidoscopie urmată de clisma baritată, colonoscopie, CA-125.\n" +
                        "MILTRA MICI: teste pentru malabsorbție.\n" +
                        " O probă de scaun este suficientă în diareea acută de mai mult de o săptămână pentru a căuta infecții comune. Urmărirea necesară pentru a arăta eliminarea salmonelei.\n" +
                        " Serii de trei probe zilnice de scaun necesare pentru a căuta ovule, chisturi și paraziți în diareea cronică.\n" +
                        " FBC: Hb poate fi redusă și VSH/CRP crescut în IBD și malignitate; anemie feriprivă în neoplazie, boala celiacă; diverticulită – verificați feritina, B12 și acidul folic; WCC crescut în IBD și infecție.\n" +
                        " TFT: va dezvălui tireotoxicoza.\n" +
                        " Anticorpi anti-endomiziali și anti-gliadină: sugerează boala celiacă dacă este pozitiv.\n" +
                        " Calprotectina fecală: ajută la excluderea bolilor inflamatorii intestinale.\n" +
                        " LFT: poate sugera secundare sau alcoolism.\n" +
                        " Analiza urinei: greutate specifică mare în deshidratare.\n" +
                        " Proctoscopie/sigmoidoscopie urmată de clisma baritată sau colonoscopie (aranjată de obicei de specialist): va confirma diagnosticul de malignitate, diverticuloză, carcinom și IBD.\n" +
                        " CA-125: pentru a ajuta la excluderea cancerului ovarian – în special la femeile cu vârsta de 50 sau mai mult.\n" +
                        " Teste pentru malabsorbție: cum ar fi analiza grăsimii din scaun, testul de toleranță la lactoză, biopsia intestinală subțire (toate îngrijiri secundare).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Clarificați ce înseamnă pacienții prin diaree – se pot referi doar la o schimbare minoră a obiceiului lor normal sau la trecerea frecventă a scaunelor normale.\n" +
                        "  Giardioza este mult mai frecventă decât se credea anterior și poate fi dificil de izolat în specimenele de scaun. Tratamentul empiric este justificat dacă tabloul clinic este sugestiv (debut recent după călătorie de diaree grasă persistentă cu anorexie, greață și balonare).\n" +
                        "IBS cauzează rareori diaree nocturnă.\n" +
                        "  Pacienții cu gastroenterită ar trebui să se îmbunătățească în mod constant după câteva zile, dar pot prezenta simptome până la 10 zile - avertizați-i despre acest lucru.\n" +
                        "  Nu vă lăsați surprins de diareea prin debordare la vârstnici. Singura modalitate de a stabili acest diagnostic este printr-un PR.\n" +
                        "  Nu uitați să întrebați despre călătoriile și ocupația în străinătate, care au implicații pentru posibilitățile de diagnosticare și management.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Pierderea în greutate în diareea cronică este foarte sugestivă pentru o patologie semnificativă.\n" +
                        "  La o persoană tânără și altfel bine, este rezonabil să se facă un diagnostic clinic pozitiv al sindromului de colon iritabil cu investigații minime – dar aveți grijă să puneți acest diagnostic pentru prima dată la persoanele de vârstă mijlocie și la vârstnici. Patologia semnificativă care imită IBS este\n" +
                        "probabil.\n" +
                        "  Evaluați cu atenție hidratarea la sugari și vârstnici cu diaree; dacă există semne de deshidratare, internați întotdeauna la spital.\n" +
                        "  Consultația telefonică inițială este suficientă pentru majoritatea cazurilor de diaree acută, dar dacă aveți dureri abdominale constante (nu colicioase), întotdeauna vedeți și examinați pentru a exclude o afecțiune chirurgicală acută.\n" +
                        "  Amintiți-vă că diareea acută la vârstnici poate precipita sau agrava insuficiența renală – mai ales dacă sunt tratați cu inhibitori ai ECA. Opriți aceste medicamente pe durata bolii și asigurați-vă o hidratare adecvată");
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