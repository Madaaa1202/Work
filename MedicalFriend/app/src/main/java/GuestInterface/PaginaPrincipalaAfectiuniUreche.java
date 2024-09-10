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

public class PaginaPrincipalaAfectiuniUreche extends AppCompatActivity {
    Spinner spinner;
    TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_afectiuni_ureche);
        overridePendingTransition(0, 0);
        textView=(TextView)findViewById(R.id.TextViewDenumireAfectiuneUreche);
        spinner=(Spinner) findViewById(R.id.spinnerCategoriiPentruFiecareBoala);
        textView2=(TextView) findViewById(R.id.TextViewInformatiiAfectiuneUreche);

        if(textView.getText().toString().equals("Ohrenschmerzen")) {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniDe, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Earache"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuni, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Mal d'oreille"))
        {
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.categoriiInformatiiAfectiuniFr, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(new function());
        }
        else if(textView.getText().toString().equals("Dureri de urechi"))
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
                textView2.setText("This the commonest reason for an out-of-hours call for a child. Parental distress is oft en as great as the child’s, and appropriate advice can do much to relieve this – even over the telephone. Causes in adults are far more varied than for children and can originate in the pinna, ear canal, middle ear and from neighbouring structures (referred pain). ");
            } else if (parent.getItemAtPosition(position).toString().equals("Differential diagnosis")) {
                textView2.setText("");
                textView2.setText("COMMON\n" +
                        " infective otitis media (OM): bacterial/viral\n" +
                        " infective otitis externa (OE): bacterial/fungal/viral\n" +
                        " boils and furuncles of the canal and pinna\n" +
                        " trauma (especially cotton buds) and foreign bodies (including earwax)\n" +
                        " throat problems: tonsillitis/pharyngitis/quinsy\n" +
                        "OCCASIONAL\n" +
                        " temporomandibular joint (TMJ) dysfunction\n" +
                        " dental abscess\n" +
                        " impacted molar\n" +
                        " trigeminal neuralgia\n" +
                        " ear canal eczema/seborrhoeic dermatitis\n" +
                        " chondrodermatitis nodularis helicis externa\n" +
                        "RARE\n" +
                        " mastoiditis\n" +
                        " cervical spondylosis\n" +
                        " cholesteatoma\n" +
                        " malignant disease\n" +
                        " barotrauma ");
            } else if (parent.getItemAtPosition(position).toString().equals("Possible investigations")) {
                textView2.setText("");
                textView2.setText("LIKELY: none.\n" +
                        "POSSIBLE: ear swab.\n" +
                        "SMALL PRINT: X-rays of TMJ, teeth and mastoid bone, FBC, Paul–Bunnell test.\n" +
                        " Swab of ear canal useful if discharge present, aft er failure of empirical fi rst-line treatment.\n" +
                        " X-ray of mastoid bone excludes mastoiditis if mastoid clear – usually arranged by specialist.\n" +
                        "X-rays of TMJ and teeth are the remit of the dentist or oral surgeon.\n" +
                        " FBC and Paul–Bunnell test useful if glandular fever suspected. Th e diagnosis provides a label and guides further advice, though no specifi c treatment exists.\n" +
                        " Further specialist investigations may include CT/MRI as the only way adequately (noninvasively) to investigate the inner ear and temporal bone anatomy. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Top tips")) {
                textView2.setText("");
                textView2.setText("Persistent debris in the ear canal will prevent resolution of OE and mask possible underlying causes. Aural toilet is essential.\n" +
                        " If inserting the aural speculum causes pain, the diagnosis is likely to be otitis externa or a furuncle.\n" +
                        " Don’t forget to ask about trauma – especially the use of a cotton bud. Excavating earwax with a bud tends to produce an infl amed canal and drum, mimicking infection.\n" +
                        " Earache can be excruciating – don’t underestimate the need for adequate analgesia while you establish and treat the cause. ");
            } else if (parent.getItemAtPosition(position).toString().equals("Red flags")) {
                textView2.setText("");
                textView2.setText(" Consider mastoiditis if foul-smelling discharge is present for more than 10 days. Look for swelling behind the ear and downward displacement of the pinna.\n" +
                        " Don’t be too ready to diagnose otitis media in children – URTIs and crying inevitably result in some redness of the drum. Indiscriminate prescribing may lead to iatrogenic problems or the masking of the true diagnosis.\n" +
                        " Beware the elderly patient with intractable, unexplained earache – refer to exclude a nasopharyngeal carcinoma.");
            }
            //de
            else if (parent.getItemAtPosition(position).toString().equals("Die GP-Übersicht")) {
                textView2.setText("");
                textView2.setText("Dies ist der häufigste Grund für einen Anruf außerhalb der Geschäftszeiten für ein Kind. Die Not der Eltern ist oft so groß wie die des Kindes, und eine entsprechende Beratung kann viel dazu beitragen – auch am Telefon. Die Ursachen bei Erwachsenen sind weitaus vielfältiger als bei Kindern und können von der Ohrmuschel, dem Gehörgang, dem Mittelohr und von benachbarten Strukturen ausgehen (Übertragungsschmerz).");
            } else if (parent.getItemAtPosition(position).toString().equals("Differenzialdiagnose")) {
                textView2.setText("");
                textView2.setText("GEMEINSAMES\n" +
                        "  infektiöse Mittelohrentzündung (OM): bakteriell/viral\n" +
                        "  infektiöse Otitis externa (OE): bakteriell/mykotisch/viral\n" +
                        "  Furunkel und Furunkel des Kanals und der Ohrmuschel\n" +
                        "  Trauma (insbesondere Wattestäbchen) und Fremdkörper (einschließlich Ohrenschmalz)\n" +
                        "  Halsprobleme: Tonsillitis/Pharyngitis/Quinsy\n" +
                        "GELEGENTLICH\n" +
                        "  Dysfunktion des Kiefergelenks (TMJ).\n" +
                        "  Zahnabszess\n" +
                        "  betroffener Backenzahn\n" +
                        "  Trigeminusneuralgie\n" +
                        "  Gehörgangekzem/seborrhoische Dermatitis\n" +
                        "  Chondrodermatitis nodularis helicis externa\n" +
                        "SELTEN\n" +
                        "  Mastoiditis\n" +
                        "  zervikale Spondylose\n" +
                        "  Cholesteatom\n" +
                        "  bösartige Erkrankung\n" +
                        "  Barotrauma");
            } else if (parent.getItemAtPosition(position).toString().equals("Mögliche Ermittlungen")) {
                textView2.setText("");
                textView2.setText("WAHRSCHEINLICH: keine.\n" +
                        "MÖGLICH: Ohrenabstrich.\n" +
                        "KLEINDRUCK: Röntgenaufnahmen von Kiefergelenk, Zähnen und Mastoidknochen, FBC, Paul-Bunnell-Test.\n" +
                        "  Abstrich des Gehörgangs nützlich, wenn Ausfluss vorhanden ist, nach Versagen der empirischen Erstbehandlung.\n" +
                        "  Eine Röntgenaufnahme des Mastoidknochens schließt eine Mastoiditis aus, wenn das Mastoid klar ist – normalerweise von einem Spezialisten angeordnet.\n" +
                        "Röntgenaufnahmen von Kiefergelenken und Zähnen sind die Aufgabe des Zahnarztes oder Oralchirurgen.\n" +
                        "  FBC und Paul-Bunnell-Test sinnvoll bei Verdacht auf Drüsenfieber. Die Diagnose liefert ein Etikett und führt zu weiteren Ratschlägen, obwohl es keine spezifische Behandlung gibt.\n" +
                        "  Weitere fachärztliche Untersuchungen können CT/MRT als einzige Möglichkeit umfassen, die Anatomie des Innenohrs und des Schläfenbeins angemessen (nichtinvasiv) zu untersuchen.");
            } else if (parent.getItemAtPosition(position).toString().equals("Beste Tipps")) {
                textView2.setText("");
                textView2.setText("Anhaltende Trümmer im Gehörgang verhindern die Auflösung von OE und maskieren mögliche zugrunde liegende Ursachen. Aural Toilette ist unerlässlich.\n" +
                        "  Wenn das Einführen des Ohrspekulums Schmerzen verursacht, ist die Diagnose wahrscheinlich eine Otitis externa oder ein Furunkel.\n" +
                        "  Vergessen Sie nicht, nach Traumata zu fragen – insbesondere nach der Verwendung eines Wattestäbchens. Das Ausgraben von Ohrenschmalz mit einer Knospe neigt dazu, einen entzündeten Kanal und eine Trommel zu erzeugen, was eine Infektion vortäuscht.\n" +
                        "  Ohrenschmerzen können unerträglich sein – unterschätzen Sie nicht die Notwendigkeit einer angemessenen Analgesie, während Sie die Ursache ermitteln und behandeln.");
            } else if (parent.getItemAtPosition(position).toString().equals("Rote Flaggen")) {
                textView2.setText("");
                textView2.setText("Ziehen Sie eine Mastoiditis in Betracht, wenn der übel riechende Ausfluss länger als 10 Tage besteht. Achten Sie auf eine Schwellung hinter dem Ohr und eine Verschiebung der Ohrmuschel nach unten.\n" +
                        "  Seien Sie nicht zu bereit, bei Kindern eine Mittelohrentzündung zu diagnostizieren – URTIs und Weinen führen unweigerlich zu einer gewissen Rötung des Trommelfells. Wahlloses Verschreiben kann zu iatrogenen Problemen oder zur Verschleierung der wahren Diagnose führen.\n" +
                        "  Vorsicht bei älteren Patienten mit hartnäckigen, unerklärlichen Ohrenschmerzen – siehe Ausschluss eines Nasopharynxkarzinoms.");
            }
            //fr
            else if (parent.getItemAtPosition(position).toString().equals("La vue d'ensemble du médecin généraliste")) {
                textView2.setText("");
                textView2.setText("C'est la raison la plus courante d'un appel en dehors des heures d'ouverture pour un enfant. La détresse parentale est souvent aussi grande que celle de l'enfant, et des conseils appropriés peuvent faire beaucoup pour la soulager, même par téléphone. Les causes chez les adultes sont beaucoup plus variées que chez les enfants et peuvent provenir du pavillon, du conduit auditif, de l'oreille moyenne et des structures voisines (douleur projetée).");
            } else if (parent.getItemAtPosition(position).toString().equals("Diagnostic différentiel")) {
                textView2.setText("");
                textView2.setText("COMMUN\n" +
                        "  otite moyenne infectieuse (OM): bactérienne/virale\n" +
                        "  otite externe infectieuse (OE): bactérienne/fongique/virale\n" +
                        "  furoncles et furoncles du canal et du pavillon\n" +
                        "  traumatismes (surtout cotons-tiges) et corps étrangers (dont cérumen)\n" +
                        "  problèmes de gorge : amygdalite/pharyngite/angine\n" +
                        "OCCASIONNEL\n" +
                        "  dysfonctionnement de l'articulation temporo-mandibulaire (ATM)\n" +
                        "  abcès dentaire\n" +
                        "  molaire incluse\n" +
                        "  la névralgie du trijumeau\n" +
                        "  eczéma du conduit auditif/dermatite séborrhéique\n" +
                        "  chondrodermite nodulaire helicis externe\n" +
                        "RARE\n" +
                        "  mastoïdite\n" +
                        "  arthrose cervicale\n" +
                        "  cholestéatome\n" +
                        "  maladie maligne\n" +
                        "  barotraumatisme");
            } else if (parent.getItemAtPosition(position).toString().equals("Enquêtes possibles")) {
                textView2.setText("");
                textView2.setText("PROBABLE : aucun.\n" +
                        "POSSIBLE : écouvillon d'oreille.\n" +
                        "PETITS CARACTÈRES : radiographies de l'ATM, des dents et de l'os mastoïdien, FBC, test de Paul-Bunnell.\n" +
                        "  Prélèvement du conduit auditif utile si écoulement présent, après échec du traitement empirique de première intention.\n" +
                        "  La radiographie de l'os mastoïdien exclut la mastoïdite si la mastoïde est claire - généralement organisée par un spécialiste.\n" +
                        "Les radiographies de l'ATM et des dents sont du ressort du dentiste ou du chirurgien buccal.\n" +
                        "  FBC et test de Paul-Bunnell utiles en cas de suspicion de fièvre glandulaire. Le diagnostic fournit une étiquette et oriente d'autres conseils, bien qu'aucun traitement spécifique n'existe.\n" +
                        "  D'autres investigations spécialisées peuvent inclure la tomodensitométrie / IRM comme seul moyen adéquat (de manière non invasive) d'étudier l'anatomie de l'oreille interne et de l'os temporal.");
            } else if (parent.getItemAtPosition(position).toString().equals("Meilleures astuces"))
            {
                textView2.setText("");
                textView2.setText("Des débris persistants dans le conduit auditif empêcheront la résolution de l'OE et masqueront les causes sous-jacentes possibles. La toilette auditive est essentielle.\n" +
                        "  Si l'insertion du spéculum auditif provoque des douleurs, le diagnostic est probablement une otite externe ou un furoncle.\n" +
                        "  N'oubliez pas de poser des questions sur les traumatismes - en particulier l'utilisation d'un coton-tige. L'excavation du cérumen avec un bourgeon a tendance à produire un canal et un tympan enflammés, imitant l'infection.\n" +
                        "  Le mal d'oreille peut être atroce - ne sous-estimez pas la nécessité d'une analgésie adéquate pendant que vous établissez et traitez la cause.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Drapeaux rouges"))
            {
                textView2.setText("");
                textView2.setText("Envisager une mastoïdite si un écoulement nauséabond est présent pendant plus de 10 jours. Recherchez un gonflement derrière l'oreille et un déplacement vers le bas du pavillon.\n" +
                        "  Ne soyez pas trop prêt à diagnostiquer l'otite moyenne chez les enfants - les URTI et les pleurs entraînent inévitablement une rougeur du tambour. Une prescription aveugle peut entraîner des problèmes iatrogènes ou masquer le véritable diagnostic.\n" +
                        "  Méfiez-vous du patient âgé avec un mal d'oreille intraitable et inexpliqué - se référer pour exclure un carcinome du nasopharynx.");
            }
            //ro
            else if(parent.getItemAtPosition(position).toString().equals("Prezentare generală a GP"))
            {
                textView2.setText("");
                textView2.setText("Acesta este cel mai frecvent motiv pentru un apel în afara orelor de program pentru un copil. Suferința parentală este adesea la fel de mare ca și a copilului, iar sfaturile adecvate pot face mult pentru a ameliora acest lucru – chiar și la telefon. Cauzele la adulți sunt mult mai variate decât la copii și pot avea originea în pavilion, canalul urechii, urechea medie și din structurile învecinate (durere referită).");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Diagnostic diferentiat"))
            {
                textView2.setText("");
                textView2.setText("UZUAL\n" +
                        "  otita medie infecțioasă (OM): bacteriană/virală\n" +
                        "  otita externă infecțioasă (OE): bacteriană/fungică/virală\n" +
                        "  furunculii si furunculii canalului si a patului\n" +
                        "  traumatisme (în special muguri de bumbac) și corpi străini (inclusiv ceară)\n" +
                        "  probleme ale gatului: amigdalita/faringita/quinsy\n" +
                        "OCAZIONAL\n" +
                        "  disfuncția articulației temporomandibulare (ATM).\n" +
                        "  abces dentar\n" +
                        "  molar impactat\n" +
                        "  nevralgie de trigemen\n" +
                        "  eczema canalului urechii/dermatita seboreica\n" +
                        "  condrodermatită nodulară helicis extern\n" +
                        "RAR\n" +
                        "  mastoidita\n" +
                        "  spondiloza cervicala\n" +
                        "  colesteatom\n" +
                        "  boala maligna\n" +
                        "  barotraumatism");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Investigații posibile"))
            {
                textView2.setText("");
                textView2.setText("PROBABIL: niciunul.\n" +
                        "POSIBIL: tampon pentru urechi.\n" +
                        "TIPOGRAFĂ MICĂ: Raze X ale ATM, dinților și osului mastoid, FBC, testul Paul-Bunnell.\n" +
                        "  Tamponul canalului urechii este util dacă există scurgeri, după eșecul tratamentului empiric de primă linie.\n" +
                        "  Radiografia osului mastoid exclude mastoidita dacă mastoidul este clar - de obicei aranjat de specialist.\n" +
                        "Razele X ale TMJ și ale dinților sunt de competența medicului dentist sau chirurgului bucal.\n" +
                        "  Testul FBC și Paul-Bunnell este util dacă se suspectează febră glandulare. Diagnosticul oferă o etichetă și îndrumă sfaturi suplimentare, deși nu există un tratament specific.\n" +
                        "  Alte investigații de specialitate pot include CT/RMN ca singura modalitate adecvată (neinvazivă) de a investiga urechea internă și anatomia osului temporal.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Sfaturile cele mai bune"))
            {
                textView2.setText("");
                textView2.setText("Resturile persistente în canalul urechii vor preveni rezolvarea OE și vor masca posibilele cauze subiacente. Toaleta auditivă este esențială.\n" +
                        "  Dacă introducerea speculului auditiv provoacă durere, este probabil ca diagnosticul să fie otita externă sau un furuncul.\n" +
                        "  Nu uitați să întrebați despre traumă - în special despre utilizarea unui vată. Excavarea ceară cu un mugure tinde să producă un canal și un tambur inflamat, mimând infecția.\n" +
                        "  Durerea de urechi poate fi chinuitoare - nu subestimați nevoia de analgezie adecvată în timp ce stabiliți și tratați cauza.");
            }
            else if(parent.getItemAtPosition(position).toString().equals("Steaguri roșii"))
            {
                textView2.setText("");
                textView2.setText("Luați în considerare mastoidita dacă scurgeri urât mirositoare sunt prezente mai mult de 10 zile. Căutați umflarea în spatele urechii și deplasarea în jos a paharului.\n" +
                        "  Nu fiți prea pregătiți să diagnosticați otita medie la copii - URTI și plânsul duc inevitabil la o oarecare roșeață a tamburului. Prescrierea fără discernământ poate duce la probleme iatrogenice sau la mascarea adevăratului diagnostic.\n" +
                        "  Atenție la pacientul vârstnic cu dureri de urechi insolubile, inexplicabile - referiți-vă pentru a exclude un carcinom nazofaringian.");
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