package pip.com.apkmuslimquran.ui.dzikir

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_dzikir_pagi.*
import kotlinx.android.synthetic.main.activity_keutamaan_dzikir.*

import pip.com.apkmuslimquran.R
import pip.com.apkmuslimquran.model.Dzikir
import pip.com.apkmuslimquran.ui.dzikir.CustomZoom.CenterZoomLayout
import pip.com.apkmuslimquran.ui.dzikir.DzikirAdapter

class DzikirPagi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_pagi)


        //kembali ke home
        back_dzikir_pagi.setOnClickListener{
            val intent = Intent(this, DzikirFragment::class.java)
            finish()
        }

        //init views
        val rv_dzikir_pagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        //init layout manager here
        val layoutManager = CenterZoomLayout(this)

        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        layoutManager.reverseLayout = true
        layoutManager.stackFromEnd = true
        rv_dzikir_pagi.layoutManager = layoutManager

        //To Auto Center Views
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_dzikir_pagi)
        rv_dzikir_pagi.isNestedScrollingEnabled = false

        //add items to array list
        val dzikir = ArrayList<Dzikir>()

        dzikir.add(
            Dzikir(
                "[ 19 / 19 ]",
                "Istighfar",
                "( dibaca 100x )",
                "أَسْتَغْفِرُ اللهَ وَأَتُوْبُ إِلَيْهِ",
                "Astagh-firullah wa atuubu ilaih.",
                "“Aku memohon ampun kepada Allah dan bertobat kepada-Nya.” ",
                "(HR. Bukhari no. 6307 dan Muslim no. 2702)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 18 / 19 ]",
                "Tasbih dan Tahmid",
                "( dibaca 100x )",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ",
                "Subhanallah wa bi-hamdih",
                "“Maha suci Allah, aku memuji-Nya.”",
                "Barangsiapa yang mengucapkan kalimat ‘subhanallah wa bi hamdih’ di pagi dan petang hari sebanyak 100 x, maka tidak ada yang datang pada hari kiamat yang lebih baik dari yang ia lakukan kecuali orang yang mengucapkan semisal atau lebih dari itu.\n" +
                        "(HR. Muslim no. 2692)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 17 / 19 ]",
                "Doa Mohon Ilmu dan Amal",
                "( dibaca 1x )",
                "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً",
                "Allahumma innii as-aluka ‘ilman naafi’a, wa rizqon thoyyibaa, wa ‘amalan mutaqobbalaa.",
                "“Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).” ",
                "(HR. Ibnu Majah no. 925 dan Ahmad 6: 305, 322. Al Hafizh Abu Thohir mengatakan bahwa hadits ini shahih)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 16 / 19 ]",
                "Dzikir Pemberat Timbangan",
                "( dibaca 3x )",
                "سُبْحَانَ اللهِ وَبِحَمْدِهِ,عَدَدَ خَلْقِهِ، وَرِضَا نَفْسِهِ، وَزِنَةَ عَرْشِهِ وَمِدَادَ كَلِمَاتِهِ",
                "Subhanallah wa bi-hamdih, ‘adada kholqih wa ridhoo nafsih. wa zinata ‘arsyih, wa midaada kalimaatih.",
                "“Maha Suci Allah, aku memujiNya sebanyak makhluk-Nya, sejauh kerelaan-Nya, seberat timbangan ‘Arsy-Nya dan sebanyak tinta tulisan kalimat-Nya.” ",
                "Faedah: \n" +
                        "Nabi shallallahu ‘alaihi wa sallam mengatakan pada Juwairiyah bahwa dzikir di atas telah mengalahkan dzikir yang dibaca oleh Juwairiyah dari selepas Shubuh sampai waktu Dhuha. \n" + "(HR. Muslim no. 2726)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 15 / 19 ]",
                "Tahlil",
                "( dibaca 1/10/100x )",
                "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
                "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodiir.",
                " “Kami telah memasuki waktu petang dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu.Wahai Rabbku, aku mohon kepada-Mu kebaikan di malam ini dan kebaikan sesudahnya. Aku berlindung kepadaMu dari kejahatan malam ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepadaMu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di kubur.” ",
                "Barangsiapa yang membaca dzikir tersebut di pagi hari sebanyak sepuluh kali, Allah akan mencatatkan baginya 10 kebaikan, menghapuskan baginya 10 kesalahan, ia juga mendapatkan kebaikan semisal memerdekakan 10 budak, Allah akan melindunginya dari gangguan setan hingg petang hari. Siapa yang mengucapkannya di petang hari, ia akan mendapatkan keutamaan semisal itu pula. \n" +
                        "(HR. An Nasai Al Kubra 6: 10)\n",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 14 / 19 ]",
                "Doa Fitrah",
                "( dibaca 1x )",
                "أَصْبَحْنَا عَلَى فِطْرَةِ اْلإِسْلاَمِ وَعَلَى كَلِمَةِ اْلإِخْلاَصِ، وَعَلَى دِيْنِ نَبِيِّنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ، وَعَلَى مِلَّةِ أَبِيْنَا إِبْرَاهِيْمَ، حَنِيْفًا مُسْلِمًا وَمَا كَانَ مِنَ الْمُشْرِكِيْنَ ",
                "Ash-bahnaa ‘alaa fithrothil islam wa ‘alaa kalimatil ikhlas wa ‘alaa diini nabiyyinaa Muhammad shallahu ‘alaihi wa sallam wa ‘alaa millati abiina ibrohim haniifam muslimaw wa maa kaana minal musyrikin",
                "“Di waktu pagi kami berada diatas fitrah agama Islam, kalimat ikhlas, agama Nabi kami Muhammad صلي الله عليه وسلم dan agama ayah kami, Ibrahim, yang berdiri di atas jalan yang lurus, muslim dan tidak tergolong orang-orang musyrik.” ",
                "(HR. Ahmad III/406, 407, ad-Darimi II/292 dan Ibnus Sunni dalam Amalul Yaum wol Lailah no. 34, Misykaatul Mashaabiih no. 2415, Shahiihal-Jaami’ish Shaghiir no. 4674, shahih)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 13 / 19 ]",
                "Doa Minta Pertolongan",
                "( dibaca 1x )",
                "يَا حَيُّ يَا قَيُّوْمُ بِرَحْمَتِكَ أَسْتَغِيْثُ، وَأَصْلِحْ لِيْ شَأْنِيْ كُلَّهُ وَلاَ تَكِلْنِيْ إِلَى نَفْسِيْ طَرْفَةَ عَيْنٍ أَبَدًا",
                "Yaa Hayyu Yaa Qoyyum, bi-rohmatika as-taghiits, wa ash-lih lii sya’nii kullahu wa laa takilnii ilaa nafsii thorfata ‘ainin abadan.",
                "“Wahai Rabb Yang Maha Hidup, wahai Rabb Yang Berdiri Sendiri (tidak butuh segala sesuatu), dengan rahmat-Mu aku minta pertolongan, perbaikilah segala urusanku dan jangan diserahkan kepadaku sekali pun sekejap mata (tanpa mendapat pertolongan dariMu).” ",
                "Faedah: \n" +
                        "Dzikir ini diajarkan oleh Nabi shallallahu ‘alaihi wa sallam pada Fathimah supaya diamalkan pagi dan petang. \n" +
                        "(HR. Ibnu As Sunni dalam ‘Amalul Yaum wal Lailah no. 46, An Nasai dalam Al Kubro (381/ 570), Al Bazzar dalam musnadnya (4/ 25/ 3107), Al Hakim (1: 545). Sanad hadits ini hasan sebagaimana dikatakan oleh Syaikh Al Albani dalam As Silsilah Ash Shahihah no. 227.)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 12 / 19 ]",
                "Doa Keridhaan",
                "( dibaca 3x )",
                "رَضِيْتُ بِاللهِ رَبًّا، وَبِاْلإِسْلاَمِ دِيْنًا، وَبِمُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ نَبِيًّا",
                "Rodhiitu billaahi robbaa wa bil-islaami diinaa, wa bi-muhammadin shallallaahu ‘alaihi wa sallama nabiyyaa.",
                "“Aku ridha Allah sebagai Rabb, Islam sebagai agama dan Muhammad shallallahu ‘alaihi wa sallam sebagai nabi.” ",
                "“Barangsiapa yang mengucapkan hadits ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.”\n" +
                        "(HR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 11 / 19 ]",
                "Doa Agar Terhindar dari Marabahaya",
                "( dibaca 3x )",
                "بِسْمِ اللَّهِ الَّذِى لاَ يَضُرُّ مَعَ اسْمِهِ شَىْءٌ فِى الأَرْضِ وَلاَ فِى السَّمَاءِ وَهُوَ السَّمِيعُ الْعَلِيمُ",
                "Bismillahilladzi laa yadhurru ma’asmihi syai-un fil ardhi wa laa fis samaa’ wa huwas samii’ul ‘aliim.",
                "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” ",
                "“Barangsiapa yang mengucapkan hadits ini sebanyak tiga kali di pagi hari dan tiga kali di petang hari, maka pantas baginya mendapatkan ridha Allah.”\n" +
                        "(HR. Abu Daud no. 5072, Tirmidzi no. 3389. Al Hafizh Abu Thohir mengatakan bahwa hadits ini hasan)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 10 / 19 ]",
                "Doa Perlindungan",
                "( dibaca 1x )",
                "اَللَّهُمَّ عَالِمَ الْغَيْبِ وَالشَّهَادَةِ فَاطِرَ السَّمَاوَاتِ وَاْلأَرْضِ، رَبَّ كُلِّ شَيْءٍ وَمَلِيْكَهُ، أَشْهَدُ أَنْ لاَ إِلَـهَ إِلاَّ أَنْتَ، أَعُوْذُ بِكَ مِنْ شَرِّ نَفْسِيْ، وَمِنْ شَرِّ الشَّيْطَانِ وَشِرْكِهِ، وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرَّهُ إِلَى مُسْلِمٍ",
                "Allahumma ‘aalimal ghoybi wasy-syahaadah faathiros samaawaati wal ardh. Robba kulli syai-in wa maliikah. Asyhadu alla ilaha illa anta. A’udzu bika min syarri nafsii wa min syarrisy-syaythooni wa syirkihi, wa an aqtarifa ‘alaa nafsii suu-an aw ajurrohu ilaa muslim.",
                "“Dengan nama Allah yang bila disebut, segala sesuatu di bumi dan langit tidak akan berbahaya, Dia-lah Yang Maha Mendengar lagi Maha Mengetahui.” ",
                "Faedah: \n" +
                        "Do’a ini diajarkan oleh Rasulullah shallallahu ‘alaihi wa sallam pada Abu Bakr Ash Shiddiq untuk dibaca pada pagi, petang dan saat beranjak tidur.\n" +
                        "(HR. Tirmidzi no. 3392 dan Abu Daud no. 5067. Al Hafizh Abu Thohir mengatakan bahawa sanad hadits ini shahih. Adapun kalimat terakhir (وَأَنْ أَقْتَرِفَ عَلَى نَفْسِيْ سُوْءًا أَوْ أَجُرُّهُ إِلَى مُسْلِمٍ) adalah tambahan dari riwayat Ahmad 2: 196. Dikomentari oleh Syaikh Syu’aib Al Arnauth bahwa hadits tersebut shahih dilihat dari jalur lainnya (shahih lighoirihi))\n",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 9 / 19 ]",
                "Doa Keselamatan",
                "( dibaca 1x )",
                "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي الدُّنْيَا وَاْلآخِرَةِ، اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ الْعَفْوَ وَالْعَافِيَةَ فِي دِيْنِيْ وَدُنْيَايَ وَأَهْلِيْ وَمَالِيْ اللَّهُمَّ اسْتُرْ عَوْرَاتِى وَآمِنْ رَوْعَاتِى. اَللَّهُمَّ احْفَظْنِيْ مِنْ بَيْنِ يَدَيَّ، وَمِنْ خَلْفِيْ، وَعَنْ يَمِيْنِيْ وَعَنْ شِمَالِيْ، وَمِنْ فَوْقِيْ، وَأَعُوْذُ بِعَظَمَتِكَ أَنْ أُغْتَالَ مِنْ تَحْتِيْ",
                "Allahumma innii as-alukal ‘afwa wal ‘aafiyah fid dunyaa wal aakhiroh. Allahumma innii as-alukal ‘afwa wal ‘aafiyah fii diinii wa dun-yaaya wa ahlii wa maalii. Allahumas-tur ‘awrootii wa aamin row’aatii. Allahummahfazh-nii mim bayni yadayya wa min kholfii wa ‘an yamiinii wa ‘an syimaalii wa min fawqii wa a’udzu bi ‘azhomatik an ugh-taala min tahtii.",
                "“Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan di dunia dan akhirat. Ya Allah, sesungguhnya aku memohon kebajikan dan keselamatan dalam agama, dunia, keluarga dan hartaku. Ya Allah, tutupilah auratku (aib dan sesuatu yang tidak layak dilihat orang) dan tenteramkanlah aku dari rasa takut. Ya Allah, peliharalah aku dari muka, belakang, kanan, kiri dan atasku. Aku berlindung dengan kebesaran-Mu, agar aku tidak disambar dari bawahku (oleh ular atau tenggelam dalam bumi dan lain-lain yang membuat aku jatuh).” ",
                "Faedah: \n" +
                        "Rasulullah shallallahu ‘alaihi wa sallam tidaklah pernah meninggalkan do’a ini di pagi dan petang hari. Di dalamnya berisi perlindungan dan keselamatan pada agama, dunia, keluarga dan harta dari berbagai macam gangguan yang datang dari berbagai arah.\n" +
                        "(HR. Abu Daud no. 5074 dan Ibnu Majah no. 3871. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 8 / 19 ]",
                "Doa ‘Afiyat",
                "( dibaca 3x )",
                "اَللَّهُمَّ عَافِنِيْ فِيْ بَدَنِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ سَمْعِيْ، اَللَّهُمَّ عَافِنِيْ فِيْ بَصَرِيْ، لاَ إِلَـهَ إِلاَّ أَنْتَ. اَللَّهُمَّ إِنِّي أَعُوْذُ بِكَ مِنَ الْكُفْرِ وَالْفَقْرِ، وَأَعُوْذُ بِكَ مِنْ عَذَابِ الْقَبْرِ، لاَ إِلَـهَ إِلاَّ أَنْتَ ",
                "Allahumma ‘aafinii fii badanii, Allahumma ‘aafinii fi sam’ii, Allhumma ‘aafinii fii bashorii, Laa ilaaha illa anta. Allhumma innii a’uudzubika minal kufri wal faqr, Allahumma innii a’uudzubika min ‘adzabilqobr, Laa ilaha illa anta.",
                "“Ya Allah, selamatkanlah tubuhku (dari penyakit dan dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah pendengaranku (dari penyakit dan maksiat atau dari apa yang tidak aku inginkan). Ya Allah, selamatkanlah penglihatanku, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau. Ya Allah, sesungguhnya aku berlindung kepada-Mu dari kekufuran dan kefakiran. Aku berlindung kepada-Mu dari siksa kubur, tidak ada Ilah yang berhak diibadahi dengan benar kecuali Engkau.”",
                "(HR. Al-Bukhari dalam Shahiib al-Adabil Mufrad no. 701, Abu Dawud no. 5090, Ahmad V/42, hasan. Lihat Shahiih Al-Adabil Mufrad no.539)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 7 / 19 ]",
                "Sayyidul Istighfar",
                "( dibaca 1x )",
                "اَللَّهُمَّ أَنْتَ رَبِّيْ لاَ إِلَـهَ إِلاَّ أَنْتَ، خَلَقْتَنِيْ وَأَنَا عَبْدُكَ، وَأَنَا عَلَى عَهْدِكَ وَوَعْدِكَ مَا اسْتَطَعْتُ، أَعُوْذُ بِكَ مِنْ شَرِّ مَا صَنَعْتُ، أَبُوْءُ لَكَ بِنِعْمَتِكَ عَلَيَّ، وَأَبُوْءُ بِذَنْبِيْ فَاغْفِرْ لِيْ فَإِنَّهُ لاَ يَغْفِرُ الذُّنُوْبَ إِلاَّ أَنْتَ",
                "Allahumma anta robbii laa ilaha illa anta, kholaqtanii wa anaa ‘abduka wa anaa ‘ala ‘ahdika wa wa’dika mas-tatho’tu. A’udzu bika min syarri maa shona’tu. Abu-u laka bi ni’matika ‘alayya wa abu-u bi dzambii. Fagh-firlii fainnahu laa yagh-firudz dzunuuba illa anta.",
                "“Ya Allah, Engkau adalah Rabbku, tidak ada ilah yang berhak disembah kecuali Engkau, Engkaulah yang menciptakanku. Aku adalah hamba-Mu. Aku akan setia pada perjanjianku pada-Mu (yaitu aku akan mentauhidkan-Mu) semampuku dan aku yakin akan janji-Mu (berupa surga untukku). Aku berlindung kepada-Mu dari kejelekan yang kuperbuat. Aku mengakui nikmat-Mu kepadaku dan aku mengakui dosaku. Oleh karena itu, ampunilah aku. Sesungguhnya tiada yang mengampuni dosa kecuali Engkau.” ",
                "“Barangsiapa mengucapkan dzikir ini di siang hari dalam keadaan penuh keyakinan, lalu ia mati pada hari tersebut sebelum petang hari, maka ia termasuk penghuni surga. Barangsiapa yang mengucapkannya di malam hari dalam keadaan penuh keyakinan, lalu ia mati sebelum pagi, maka ia termasuk penghuni surga.”\n" +
                        "(HR. Bukhari no. 6306)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 6 / 19 ]",
                "Doa Berserah diri",
                "( dibaca 1x )",
                "اللَّهُمَّ بِكَ أَصْبَحْنَا، وَبِكَ أَمْسَيْنَا ،وَبِكَ نَحْيَا، وَبِكَ نَمُوتُ، وَإِلَيْكَ النُّشُوْرُُ",
                "Allahumma bika ash-bahnaa wa bika amsyanaa wa bika nahyaa wa bika namuutu wa ilaikan nusyuur.",
                "“Ya Allah, dengan rahmat dan pertolongan-Mu kami memasuki waktu pagi, dan dengan rahmat dan pertolongan-Mu kami memasuki waktu petang. Dengan rahmat dan pertolonganMu kami hidup dan dengan kehendakMu kami mati. Dan kepada-Mu kebangkitan (bagi semua makhluk).” ",
                "(HR. Tirmidzi no. 3391 dan Abu Daud no. 5068. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini shahih)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 5 / 19 ]",
                "Doa Perlindungan",
                "( dibaca 1x )",
                "أَصْبَحْنَا وَأَصْبَحَ الْمُلْكُ لِلَّهِ، وَالْحَمْدُ لِلَّهِ، لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. رَبِّ أَسْأَلُكَ خَيْرَ مَا فِيْ هَذَا الْيَوْمِ وَخَيْرَ مَا بَعْدَهُ، وَأَعُوْذُ بِكَ مِنْ شَرِّ مَا فِيْ هَذَا الْيَوْمِ وَشَرِّ مَا بَعْدَهُ، رَبِّ أَعُوْذُ بِكَ مِنَ الْكَسَلِ وَسُوْءِ الْكِبَرِ، رَبِّ أَعُوْذُ بِكَ مِنْ عَذَابٍ فِي النَّارِ وَعَذَابٍ فِي الْقَبْرِ",
                "Ash-bahnaa wa ash-bahal mulku lillah walhamdulillah, laa ilaha illallah wahdahu laa syarika lah, lahul mulku walahul hamdu wa huwa ‘ala kulli syai-in qodir. Robbi as-aluka khoiro maa fii hadzal yaum wa khoiro maa ba’dahu, wa a’udzu bika min syarri maa fii hadzal yaum wa syarri maa ba’dahu. Robbi a’udzu bika minal kasali wa su-il kibar. Robbi a’udzu bika min ‘adzabin fin naari wa ‘adzabin fil qobri.",
                "“Kami telah memasuki waktu pagi dan kerajaan hanya milik Allah, segala puji bagi Allah. Tidak ada ilah (yang berhak disembah) kecuali Allah semata, tiada sekutu bagi-Nya. Milik Allah kerajaan dan bagi-Nya pujian. Dia-lah Yang Mahakuasa atas segala sesuatu. Wahai Rabbku, aku mohon kepada-Mu kebaikan di hari ini dan kebaikan sesudahnya. Aku berlindung kepada-Mu dari kejahatan hari ini dan kejahatan sesudahnya. Wahai Rabbku, aku berlindung kepada-Mu dari kemalasan dan kejelekan di hari tua. Wahai Rabbku, aku berlindung kepada-Mu dari siksaan di neraka dan siksaan di alam kubur.”",
                "Faedah: \n" +
                        "Meminta pada Allah kebaikan di hari ini dan kebaikan sesudahnya, juga agar terhindar dari kejelekan di hari ini dan kejelekan sesudahnya. Di dalamnya berisi pula permintaan agar terhindar dari rasa malas padahal mampu untuk beramal, juga agar terhindar dari kejelekan di masa tua. Di dalamnya juga berisi permintaan agar terselamatkan dari siksa kubur dan siksa neraka yang merupakan siksa terberat di hari kiamat kelak.\n" +
                        "(HR. Muslim no. 2723. Lihat keterangan Syarh Hisnul Muslim, hal. 161)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 4 / 19 ]",
                "Surat An-Naas",
                "( dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                        "قُلْ اَعُوْذُ بِرَبِّ النَّاسِۙ (١) مَلِكِ النَّاسِۙ (٢) اِلٰهِ النَّاسِۙ (٣) مِنْ شَرِّ الْوَسْوَاسِ  الْخَنَّاسِۖ (٤) الَّذِيْ يُوَسْوِسُ فِيْ صُدُوْرِ النَّاسِۙ (٥) مِنَ الْجِنَّةِ وَالنَّاسِ (٦)",
                "Bismillahirrahmannirrahiim\n" +
                        "Qul a'ụżu birabbin-nās(i). Malikin-nās(i). ilāhin-nās(i). Min syarril-waswāsil-khannās(i). Allażī yuwaswisu fī ṣudụrin-nās(i). Minal-jinnati wan-nās(i).",
                " “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                        "“Katakanlah: Aku berlindung kepada Rabb manusia. Raja manusia. Sembahan manusia, dari kejahatan (bisikan) syaitan yang biasa bersembunyi, yang membisikkan (kejahatan) ke dalam dada manusia, dari jin dan manusia.” \n",
                "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                        "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 3 / 19 ]",
                "Surat Al-Falaq",
                "( dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                        "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ (١) مِن شَرِّ مَا خَلَقَ (٢) وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ (٣) وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ (٤) وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ (٥)",
                "Bismillahirrahmannirrahiim\n" +
                        "Qul a’ụżu birabbil-falaq(i). Min syarri mā khalaq(a). Wa min syarri gāsiqin iżā waqab(a). Wa min syarrin-naffāṡāti fil-‘uqad(i). Wa min syarri ḥāsidin iżā ḥasad(a).",
                "“Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                        "“Katakanlah: Aku berlindung kepada Rabb yang menguasai Shubuh, dari kejahatan makhluk-Nya, dan dari kejahatan malam apabila telah gelap gulita, dan dari kejahatan-kejahatan wanita tukang sihir yang menghembus pada buhul-buhul, dan dari kejahatan orang yang dengki apabila ia dengki”. ",
                "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                        "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 2 / 19 ]",
                "Surat Al-Ikhlas",
                "( dibaca 3x )",
                "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                        "قُلْ هُوَ اللَّهُ أَحَدٌ (١) اللَّهُ الصَّمَدُ (٢)\n" +
                        " لَمْ يَلِدْ وَلَمْ يُولَدْ (٣) وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ (٤)",
                "Bismillahirrahmannirrahiim\n" +
                        "Qul huwallāhu aḥad(un). Allāhuṣ-ṣamad. Lam yalid wa lam yụlad. Wa lam yakul lahụ kufuwan aḥad.",
                " “Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang”\n\n" +
                        "“Katakanlah:  Dialah Allah, Yang Maha Esa. Allah adalah ilah yang bergantung kepada-Nya segala urusan. Dia tidak beranak dan tiada pula diperanakkan, dan tidak ada seorang pun yang setara dengan Dia.” ",
                "“Siapa yang mengucapkannya masing-masing tiga kali ketika pagi dan petang, maka segala sesuatu akan dicukupkan untuknya.”\n" +
                        "(HR. Abu Daud no. 5082, Tirmidzi no. 3575. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan)",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

        dzikir.add(
            Dzikir(
                "[ 1 / 19 ]",
                "Membaca Ayat Kursi",
                "( dibaca 1x )",
                "أَعُوذُ بِاللَّهِ مِنَ الشَّيْطَانِ الرَّجِيمِ\n" +
                        "\n" +
                        "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ",
                "",
                "“Aku berlindung kepada Allah dari godaan syaitan yang terkutuk.”\n" +
                        "\n" +
                        "“Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar.” (QS. Al Baqarah: 255)",
                "“Siapa yang membacanya ketika petang, maka ia akan dilindungi (oleh Allah dari berbagai gangguan) hingga pagi. Siapa yang membacanya ketika pagi, maka ia akan dilindungi hingga petang.”\n" +
                        "HR. Al Hakim (1: 562). Syaikh Al Albani menshahihkan hadits tersebut dalam Shahih At Targhib wa At Tarhib no. 655.",
                "https://imgbb.online/images/2020/12/26/Android---9-7.png"
            )
        )

//        dzikir.add(
//            Dzikir(
//                null,
//                null,
//                null,
//                null,
//                null,
//                null,
//                null,
//                "https://imgbb.online/images/2020/12/29/Android---17-1.png"
//            )
//        )

        //add arraylist to recyclerview

        rv_dzikir_pagi.adapter = DzikirAdapter(this, dzikir)

    }


}


