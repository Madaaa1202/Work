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

public class PaginaPrincipalaAfectiuniOchi extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_ochi);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneOchi);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneOchi);

        if(textView.getText().toString().equals("Doppeltsehen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Double vision"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Vision double"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Viziune dubla"))
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
                textView2.setText("Diplopia is nearly always binocular, with movement of one eye being limited for a number of possible reasons. Although relatively uncommon as a presenting symptom, the majority of causes are signifi cant and therefore careful assessment is essential.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " physiological (focusing too near, or perceiving objects nearer than those focused on)\n" +
                        " intoxication: prescribed sedation, non-prescribed drugs, especially excess alcohol, opiates,\n" +
                        "benzodiazepines\n" +
                        " stroke\n" +
                        " mild head injury, causing temporary diplopia\n" +
                        " facial bone trauma – orbital and zygomatic fracture\n" +
                        "OCCASIONAL\n" +
                        " mononeuropathy, e.g. diabetes, MS\n" +
                        " orbital disease (usually associated with pain and proptosis) and aft er surgery (scarring\n" +
                        "limiting globe movement)\n" +
                        " Guillain–Barré syndrome\n" +
                        " palsy of third, fourth or sixth cranial nerves due to intracranial space-occupying lesion\n" +
                        "(haemorrhage, tumour, aneurysm, abscess, cavernous sinus thrombosis)\n" +
                        " myasthenia gravis\n" +
                        " monocular diplopia: early cataract, irregularity of corneal surface, e.g. post trauma or\n" +
                        "infl ammation\n" +
                        "RARE\n" +
                        " ophthalmoplegic migraine\n" +
                        " Tolosa–Hunt syndrome: granulomatous or infl ammatory process in anterior portion of\n" +
                        "cavernous sinus or superior orbital fi ssure\n" +
                        " pseudoparalysis of ocular muscles: dysthyroid disease; Duane’s syndrome (congenital\n" +
                        "fi brosis of lateral rectus)\n" +
                        " orbital myositis\n" +
                        " pituitary exophthalmos ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none; FBC, ESR/CRP, lipid studies, urinalysis, fasting glucose or HbA1c.\n" +
                        "POSSIBLE: TFT, X-rays, CT/MRI scan.\n" +
                        "SMALL PRINT: edrophonium test, EMG, CSF studies, angiography.\n" +
                        " No investigation is indicated in primary care for the most common causes – referral is the likeliest course of action.\n" +
                        " FBC, ESR/CRP, lipid studies – if stroke suspected and admission not required. FBC and ESR/CRP will also provide evidence of infl ammatory conditions.\n" +
                        " Urinalysis for glucose/fasting glucose or HbA1c – to investigate possible diabetes.\n" +
                        " TFT will reveal hyperthyroidism.\n" +
                        " Other investigations (and possibly some of the above) are likely to be carried out in secondary care: skull and facial bone X-rays in trauma cases; CT or MRI scan (head injury, stroke, MS, space-occupying lesion); specialist neurological investigations (edrophonium\n" +
                        "test, single-fi bre EMG studies, CSF examination, angiography). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Establish if the diplopia is binocular or not. Uniocular double vision has a much narrower differential diagnosis.\n" +
                        " Take time to clarify the symptom. Sometimes, patients complain of ‘double vision’ when they really mean blurring – and vice versa.\n" +
                        " Th e cover test is a reliable way to fi nd out which eye is aff ected.\n" +
                        " Fourth cranial nerve palsy produces diplopia on looking downwards and inwards, often noticed when descending stairs. Th e patient may try to compensate by tilting the head – so-called ocular torticollis. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Intoxication in conjunction with a head injury is commonly seen in custody medicine and A&E departments. Admission for neurological observation is strongly recommended.\n" +
                        " Diplopia of acute onset may well refl ect serious pathology – refer for urgent assessment.\n" +
                        " Intermittent diplopia should not be dismissed too readily as insignifi cant – remember that myasthenia gravis and multiple sclerosis are possibilities. ");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Diplopie ist fast immer binokular, wobei die Bewegung eines Auges aus einer Reihe möglicher Gründe eingeschränkt ist. Obwohl es sich um ein relativ seltenes Symptom handelt, sind die meisten Ursachen signifikant und daher ist eine sorgfältige Beurteilung unerlässlich.");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        " physiologisch (zu nah fokussieren oder Objekte näher wahrnehmen als die fokussierten)\n" +
                        " Intoxikation: verschriebene Beruhigungsmittel, nicht verschreibungspflichtige Medikamente, insbesondere übermäßiger Alkohol, Opiate,\n" +
                        "Benzodiazepine\n" +
                        " Schlaganfall\n" +
                        " leichte Kopfverletzung, die zu vorübergehender Diplopie führt\n" +
                        " Gesichtsknochentrauma – Augenhöhlen- und Jochbeinfraktur\n" +
                        "GELEGENTLICH\n" +
                        " Mononeuropathie, z.B. Diabetes, MS\n" +
                        " Augenhöhlenerkrankung (normalerweise verbunden mit Schmerzen und Proptosis) und nach Operationen (Narbenbildung\n" +
                        "Begrenzung der Globusbewegung)\n" +
                        " Guillain Barre-Syndrom\n" +
                        " Lähmung des dritten, vierten oder sechsten Hirnnerven aufgrund einer intrakraniellen Raumforderung\n" +
                        "(Blutung, Tumor, Aneurysma, Abszess, Sinus-cavernosus-Thrombose)\n" +
                        " Myasthenia gravis\n" +
                        " monokulare Diplopie: frühe Katarakt, Unregelmäßigkeit der Hornhautoberfläche, z. Posttrauma bzw\n" +
                        "Entzündung\n" +
                        "SELTEN\n" +
                        " ophthalmoplegische Migräne\n" +
                        " Tolosa-Hunt-Syndrom: granulomatöser oder entzündlicher Prozess im vorderen Teil des\n" +
                        "Sinus cavernosus oder obere Augenhöhlenfissur\n" +
                        " Pseudoparalyse der Augenmuskeln: Dysthyreose; Duane-Syndrom (angeboren\n" +
                        "Fibrose des lateralen Rektus)\n" +
                        " orbitale Myositis\n" +
                        " Hypophysen-Exophthalmus");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine; FBC, ESR/CRP, Lipidstudien, Urinanalyse, Nüchternglukose oder HbA1c.\n" +
                        "MÖGLICH: TFT, Röntgen, CT/MRT.\n" +
                        "KLEINDRUCK: Edrophoniumtest, EMG, Liquoruntersuchungen, Angiographie.\n" +
                        "  Für die häufigsten Ursachen ist keine Untersuchung in der Primärversorgung angezeigt – Überweisung ist die wahrscheinlichste Vorgehensweise.\n" +
                        "  FBC, ESR/CRP, Lipiduntersuchungen – bei Verdacht auf Schlaganfall und Einweisung nicht erforderlich. FBC und ESR/CRP liefern auch Nachweise für entzündliche Zustände.\n" +
                        "  Urinanalyse auf Glukose/Nüchternglukose oder HbA1c – um einen möglichen Diabetes zu untersuchen.\n" +
                        "  TFT zeigt Hyperthyreose.\n" +
                        "  Andere Untersuchungen (und möglicherweise einige der oben genannten) werden wahrscheinlich in der Sekundärversorgung durchgeführt: Röntgenaufnahmen von Schädel und Gesichtsknochen in Traumafällen; CT- oder MRT-Scan (Kopfverletzung, Schlaganfall, MS, raumfordernde Läsion); fachärztliche neurologische Untersuchungen (Edrophonium\n" +
                        "Test, Einzelfaser-EMG-Untersuchungen, Liquoruntersuchung, Angiographie).");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Stellen Sie fest, ob die Diplopie binokular ist oder nicht. Uniokulares Doppeltsehen hat eine viel engere Differenzialdiagnose.\n" +
                        "  Nehmen Sie sich Zeit, um das Symptom zu klären. Manchmal klagen Patienten über „Doppeltsehen“, wenn sie eigentlich Unschärfe meinen – und umgekehrt.\n" +
                        "  Der Abdecktest ist eine zuverlässige Methode, um herauszufinden, welches Auge betroffen ist.\n" +
                        "  Die Vierte Hirnnervenlähmung erzeugt Diplopie beim Blick nach unten und nach innen, was oft beim Treppensteigen bemerkt wird. Der Patient kann versuchen, dies durch Neigen des Kopfes auszugleichen – sogenannter Schiefhals der Augen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Eine Intoxikation in Verbindung mit einer Kopfverletzung wird häufig in der Haftmedizin und in Notaufnahmeabteilungen beobachtet. Eine Aufnahme zur neurologischen Beobachtung wird dringend empfohlen.\n" +
                        "  Akut einsetzende Diplopie kann sehr wohl eine schwerwiegende Pathologie widerspiegeln – wenden Sie sich zur dringenden Beurteilung.\n" +
                        "  Intermittierende Diplopie sollte nicht zu schnell als unbedeutend abgetan werden – denken Sie daran, dass Myasthenia gravis und Multiple Sklerose möglich sind.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("La diplopie est presque toujours binoculaire, le mouvement d'un œil étant limité pour un certain nombre de raisons possibles. Bien que relativement rare en tant que symptôme initial, la majorité des causes sont importantes et, par conséquent, une évaluation minutieuse est essentielle.");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        " physiologique (mise au point trop proche ou perception d'objets plus proches que ceux sur lesquels la mise au point est effectuée)\n" +
                        " intoxication : sédation prescrite, médicaments sans ordonnance, notamment excès d'alcool, opiacés,\n" +
                        "benzodiazépines\n" +
                        " caresser\n" +
                        " blessure légère à la tête, provoquant une diplopie temporaire\n" +
                        " traumatisme osseux facial - fracture orbitaire et zygomatique\n" +
                        "OCCASIONNEL\n" +
                        " mononeuropathie, par ex. diabète, SEP\n" +
                        " maladie orbitaire (généralement associée à des douleurs et à une exophtalmie) et après une intervention chirurgicale (cicatrisation\n" +
                        "limitant le mouvement du globe)\n" +
                        " Le syndrome de Guillain Barre\n" +
                        " paralysie des troisième, quatrième ou sixième nerfs crâniens due à une lésion intracrânienne occupant de l'espace\n" +
                        "(hémorragie, tumeur, anévrisme, abcès, thrombose du sinus caverneux)\n" +
                        " myasthénie grave\n" +
                        " diplopie monoculaire : cataracte précoce, irrégularité de la surface cornéenne, par ex. post-traumatique ou\n" +
                        "inflammation\n" +
                        "RARE\n" +
                        " migraine ophtalmoplégique\n" +
                        " Syndrome de Tolosa-Hunt : processus granulomateux ou inflammatoire dans la partie antérieure de\n" +
                        "sinus caverneux ou fissure orbitaire supérieure\n" +
                        " pseudoparalysie des muscles oculaires : maladie dysthyroïdienne ; Syndrome de Duane (congénital\n" +
                        "fibrose du droit latéral)\n" +
                        " myosite orbitaire\n" +
                        " exophtalmie hypophysaire");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE: aucun; FBC, ESR/CRP, études lipidiques, analyse d'urine, glycémie à jeun ou HbA1c.\n" +
                        "POSSIBLE : TFT, rayons X, scanner/IRM.\n" +
                        "PETITS CARACTÈRES: test à l'édrophonium, EMG, études du LCR, angiographie.\n" +
                        "  Aucune enquête n'est indiquée dans les soins primaires pour les causes les plus courantes - l'orientation est la ligne de conduite la plus probable.\n" +
                        "  FBC, ESR / CRP, études lipidiques - si AVC suspecté et admission non requise. FBC et ESR/CRP fourniront également des preuves de conditions inflammatoires.\n" +
                        "  Analyse d'urine pour le glucose / glucose à jeun ou HbA1c - pour enquêter sur un éventuel diabète.\n" +
                        "  TFT révélera une hyperthyroïdie.\n" +
                        "  D'autres examens (et éventuellement certains des précédents) sont susceptibles d'être réalisés en soins secondaires : radiographies du crâne et des os de la face en cas de traumatisme ; CT ou IRM (traumatisme crânien, accident vasculaire cérébral, SEP, lésion occupant de l'espace); explorations neurologiques spécialisées (édrophonium\n" +
                        "test, études EMG monofibre, examen du LCR, angiographie).");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Établir si la diplopie est binoculaire ou non. La vision double unioculaire a un diagnostic différentiel beaucoup plus étroit.\n" +
                        "  Prenez le temps de clarifier le symptôme. Parfois, les patients se plaignent d'une \"double vision\" alors qu'ils veulent vraiment dire flous - et vice versa.\n" +
                        "  Le test de couverture est un moyen fiable de savoir quel œil est atteint.\n" +
                        "  La paralysie du quatrième nerf crânien produit une diplopie en regardant vers le bas et vers l'intérieur, souvent remarquée lors de la descente des escaliers. Le patient peut essayer de compenser en inclinant la tête – ce qu'on appelle un torticolis oculaire.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("L'intoxication associée à une blessure à la tête est courante dans les services de médecine de garde et les services d'urgence. L'admission pour observation neurologique est fortement recommandée.\n" +
                        "  La diplopie d'apparition aiguë peut très bien refléter une pathologie grave – référer pour une évaluation urgente.\n" +
                        "  La diplopie intermittente ne doit pas être rejetée trop facilement comme insignifiante - rappelez-vous que la myasthénie grave et la sclérose en plaques sont des possibilités.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Diplopia este aproape întotdeauna binoculară, mișcarea unui ochi fiind limitată din mai multe motive posibile. Deși relativ neobișnuit ca simptom de prezentare, majoritatea cauzelor sunt semnificative și, prin urmare, o evaluare atentă este esențială.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        " fiziologice (focalizarea prea aproape sau perceperea obiectelor mai aproape decât cele asupra cărora se concentrează)\n" +
                        " intoxicație: sedare prescrisă, medicamente fără prescripție, în special alcool în exces, opiacee,\n" +
                        "benzodiazepine\n" +
                        " accident vascular cerebral\n" +
                        " leziuni ușoare ale capului, provocând diplopie temporară\n" +
                        " traumatisme osoase faciale – fractură orbitală și zigomatică\n" +
                        "OCAZIONAL\n" +
                        " mononeuropatie, de ex. diabet, SM\n" +
                        " boala orbitală (de obicei asociată cu durere și proptoză) și după intervenție chirurgicală (cicatrici\n" +
                        "limitarea mișcării globului)\n" +
                        " Sindromul Guillain Barre\n" +
                        " paralizia nervilor cranieni al treilea, al patrulea sau al șaselea din cauza leziunii care ocupă spațiul intracranian\n" +
                        "(hemoragie, tumoră, anevrism, abces, tromboză de sinus cavernos)\n" +
                        " miastenia gravis\n" +
                        " diplopie monoculară: cataractă precoce, neregularitate a suprafeței corneei, de ex. post traumatism sau\n" +
                        "inflamație\n" +
                        "RAR\n" +
                        " migrenă oftalmoplegică\n" +
                        " Sindromul Tolosa-Hunt: proces granulomatos sau inflamator în porțiunea anterioară a\n" +
                        "sinusul cavernos sau fisura orbitală superioară\n" +
                        " pseudoparalizia mușchilor oculari: boala distiroidiană; Sindromul Duane (congenital\n" +
                        "fibroza dreptului lateral)\n" +
                        " miozita orbitală\n" +
                        " exoftalmie hipofizară");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul; FBC, VSH/CRP, studii lipidelor, analize de urină, glucoză a jeun sau HbA1c.\n" +
                        "POSIBIL: TFT, raze X, scanare CT/RMN.\n" +
                        "MILTRA MICI: test edrofoniu, EMG, studii LCR, angiografie.\n" +
                        "  Nu este indicată nicio investigație în asistența medicală primară pentru cele mai frecvente cauze – trimiterea este cea mai probabilă cale de acțiune.\n" +
                        "  Studii FBC, VSH/CRP, lipide – dacă se suspectează un accident vascular cerebral și nu este necesară internarea. FBC și ESR/CRP vor furniza, de asemenea, dovezi ale stărilor inflamatorii.\n" +
                        "  Analiza urinei pentru glucoză/glucoză a jeun sau HbA1c – pentru a investiga un posibil diabet.\n" +
                        "  TFT va dezvălui hipertiroidismul.\n" +
                        "  Alte investigații (și posibil unele dintre cele de mai sus) sunt susceptibile de a fi efectuate în îngrijirea secundară: radiografii craniului și osului facial în cazuri de traumatisme; CT sau RMN (leziune a capului, accident vascular cerebral, SM, leziune ocupant spatiu); investigații neurologice de specialitate (edrofoniu\n" +
                        "test, studii EMG monofibre, examen LCR, angiografie).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Stabiliți dacă diplopia este binoculară sau nu. Vederea dublă unioculară are un diagnostic diferențial mult mai îngust.\n" +
                        "  Fă-ți timp pentru a clarifica simptomul. Uneori, pacienții se plâng de „vedere dublă” atunci când înseamnă cu adevărat încețoșare – și invers.\n" +
                        "  Testul de acoperire este o modalitate fiabilă de a afla ce ochi este afectat.\n" +
                        "  Paralizia de nerv cranian al patrulea produce diplopie la privirea în jos și înăuntru, adesea observată la coborârea scărilor. Pacientul poate încerca să compenseze prin înclinarea capului – așa-numitul torticolis ocular.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Intoxicația în combinație cu o vătămare a capului este frecvent întâlnită în medicină de custodie și departamentele A&E. Admiterea pentru observație neurologică este insistent recomandată.\n" +
                        "  Diplopia cu debut acut poate să reflecte o patologie gravă – trimiteți pentru evaluare urgentă.\n" +
                        "  Diplopia intermitentă nu trebuie respinsă prea ușor ca nesemnificativă – amintiți-vă că miastenia gravis și scleroza multiplă sunt posibilități.");
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