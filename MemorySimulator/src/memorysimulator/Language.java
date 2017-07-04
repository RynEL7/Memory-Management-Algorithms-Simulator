package memorysimulator;

public class Language 
{
    public static final String[][] LangResources=
    {
        {
        	//English
        	"\n\t[ Welcome To Memory Simulator Program ]",//00
            "\n\t            [ Main Menu ]", //01
            "\n\t1> Run Simulator with Required Settings(Automatic)\n\t2> Run Simulator with Manual Settings\n\t3> About Program\n\t4> Change Language\n\t5> Exit Program", //02
            "\n\tChoose Your Decision : ", //03
            "\n\t[ Memory Simulator Auto Mode ]", //04
            "\n\t\n\t1> First Fit Algorithm\n\t2> Best Fit Algorithm\n\t3> Worst Fit Algorithm\n\t4> Next Fit Algorithm\n\t5> Buddy System Algorithm\n\t6> Main Menu\n\t7> Exit Program", //05
            "\n\tThis Mode will automatically generate any processes with itself by random memory blocks between 10KB,20KB,40KB,or 60KB"+
            "\n\tAnd Total Amount System Memory is 1MB @1KB/block,each Proccess will have it's time process on blocks memory"+
            "\n\tYou can choose which algorithm do you wanna use and give you statistic"+
            "", //06
            "\n\tSorry Your Input Didn't Valid ! , Try Again.", //07
            "[ First Fit Algorithm ]", //08
            "[ Best Fit Algorithm ]", //09
            "[ Worst Fit Algorithm ]", //10
            "[ Next Fit Algorithm ]", //11
            "[ Buddy System Algorithm ]", //12
            "\n\t[ Memory Simulator Manual Mode ]", //13
            "\n\tThis Mode will require a user input setting for many processe and each memory blocks needed.And require for many memory blocks and each memory size in KB"+
            "\n\tNo Limit for processes and memory blocks.You can choose which algorithm do you wanna use and give you statistic"+
            "", //14
            "Press Enter to Back to Menu...", //15
            "[ Process Started ]", //16
            "\t1>English\n\t2>Indonesian\n\t3>Exit Program\n\tEnter Your Decision Here : ",//17
            "\n\t[ Thanks For Use This Program :) ]",//18
            "\n\tYour Input Didn't Valid ! Try Again.",//19
            "\n\t        [ Choose Your Language ]\n", //20
            "\n\t[ Thanks For Use This Program :) ]",//21
            "\n\t[ Program Credits ]",//22
            "[Program Desainer & Writer]",//23
            "[Translator]",//24
            "[Support]",//25
            "\n\t[ Added Processes And Memory Blocks ]",//26
            "\t> Memory Size of Process ",//27
            "\t> Size of Memory Block ",//28
            "\n\tProcess Done...\n\n\t1> Repeat This Algorithm\n\t2> To Main Menu\n\t3> Exit Program\n\t"+
            		"Input your choice here : ",//29
            "\n\t[ Thanks For Use This Program :) ]",//30
            "\n\t[ Setting Processes ]\n\t> How Many Process Do You Want ? : ",//31
            "\n\t[ Processes Memory Size & Time ]",//32
            "\t> Memory Size(KB) Process ",//33
            " of ",//34
            "\t> Memory Time(ms) Process ", //35
            "\n\t[ Setting Memory ]\n\t> How Many Memory Blocks Do You Want ? : ",//36
            "\n\t[ Memory Blocks Size ]\n",//37
            "\t> Memory Size(KB) for Block ",//38
            "\n\tProcess Done...\n\n\t1> Repeat This Algorithm\n\t2> To Main Menu\n\t3> Exit Program\n\t",//39
            //======================
            "\n\t[ Statistic Result using First Fit ]\n\n",//40
            "\n\n\t|==============================================|"+
            "\n\t| Allocating Processes Memory to Memory Blocks |"+
            "\n\t|==============================================|",//41
            "\n\tNo.Process\t\t\t\t: ",//42
            "\n\tProcess Memory\t\t\t\t: ",//43
            "\n\tAllocated To Memory Blocks No\t\t: ",//44
            "\n\tAllocated To Memory Blocks No\t\t: Null",//45
            "\n\t---------------------------------------------------",//46
            "\n\tNo.Memory Blocks\t\t\t: ",//47
            "\n\tMemory Block Size\t\t\t: ",//48
            "\n\t[ Memory Block Not Allocated Yet ]",//49
            "\n\tMemory Block Size After Allocated\t: " ,//50
            "\n\tTime Process\t\t\t\t: ",//51
            " miliseconds",//52
            "\n\t****************************************************************",//53
            "\n\tOut Of Memory !...\n\tContinue with Process that successfull allcocated to Memory Blocks",//54
            "\n\t[ Statistic Result using Best Fit ]\n\n",//55
            "\n\t[ Statistic Result using Worst Fit ]\n\n",//56
            "\n\t[ Statistic Result using Next Fit ]\n\t>Last Memory Block Used : ",//57
            "\n\n\t|=================================================|"+
            "\n\t| Finishing Processes And Releasing Memory Blocks |"+
            "\n\t|=================================================|",//58
            "\n\t>Finishing Process No ",//59
            " in ",//60
            "\n\t[ Memory Releasing ]\n\t>Memory Block No\t: ",//61
            "\n\t>Current Size\t\t: ",//62
            " KB\n\t>After Releasing\t: ",//63
            "\n\t-------------------------------------------------------------------",//64
            "\n\n\t[ Current Memory Status ]",//65
            "\n\t>No.Memory Blocks\t: ",//66
            "\n\tSize Memory Block\t: ",//67
            "\n\t--------------------------------------",//68
            "\n\tWhere Lastest Posisiion of Memory Blocks\t: ",//69
            "\n\n\n\t We're Sorry :(\n\tBecause of LIMITEDNESS of our java Programming Language Knowledge and Work Time\n\tBuddy System is Available on C Programing Only\n\tWe've enclose .C file with this java files \n\tYou Can Compile and Try it\n\tThanks for your Understanding...\n\n\n"//70
        },
        
        {
        	//Indonesia
        	"\n\t[ Selamat Datang di Program Simulator Memori ]",//00
            "\n\t                [ Menu Utama ]", //01
            "\n\t1> Jalankan Simulator Dengan Pengaturan Otomatis \n\t2> Jalankan Simulator Dengan Pengaturan Manual\n\t3> Tentang Program\n\t4> Ubah Bahasa\n\t5> Keluar Program", //02
            "\n\tMasukan Pilihan : ", //03
            "\n\t[ Simulator Memori Mode Otomatis ]", //04
            "\n\t\n\t1> Algoritma First Fit\n\t2> Algoritma Best Fit\n\t3> Algoritma Worst Fit\n\t4> Algoritma Next Fit\n\t5> Algoritma Buddy System\n\t6> Menu Utama\n\t7> Keluar Program", //05
            "\n\tMode ini akan otomatis menghasilkan banyak prosesnya sendiri dengan blok memori secara acak antara 10KB, 20KB, atau 60KB"
            +"\n\tdan jumlah sistem memori sebesar 1MB @1KB/blok, setiap proses akan memiliki waktu proses terhadap blok memori."
            +"\n\tAtau anda bisa memilih \"SEMUA ALGORITMA\" dan memberikan statistiknya satu persatu ", //06
            "\n\tMaaf data yang anda masukkan tidak benar ! Coba lagi.", //07
            "[ Algoritma First Fit ]", //08
            "[ Algoritma Best Fit ]", //09
            "[ Algoritma Worst Fit ]", //10
            "[ Algoritma Next Fit ]", //11
            "[ Algoritma Buddy System ]", //12
            "\n\t[ Simulasi Mode Memori Manual ]", //13
            "\n\tMode ini membutuhkan masukan anda untuk proses yang banyak dan setiap blok memori yang dibutuhkan. Dan membutuhkan blok memori dan setiap ukuran memori dalam besaran KB."
            +"\n\tTidak ada batas untuk proses dan blok memorinya. Anda bisa memilih algoritma mana yang akan digunakan dan memberi statiskinya.", //14
            "Tekan Enter untuk kembali ke Menu...", //15
            "[ Proses Dimulai ]", //16
            "\t1>Bahasa Inggris\n\t2>Bahasa Indonesia\n\t3>Keluar Program\n\tMasukkan Pilihanmu kesini : ",//17
            "\n\t[ Terima Kasih Telah Menggunakan Program Ini :) ]",//18
            "\n\tMasukkan anda tidak valid! Coba lagi.",//19
            "\n\t           [ Pilih Bahasa Anda ]\n", //20
            "\n\t[ Terima Kasih Telah Menggunakan Program Ini :) ]",//21
            "\n\t[ Penghargaan Program ]",//22
            "[Penulis & Desain Program]",//23
            "[Alihbahasa]",//24
            "[Pendukung]",//25
            "\n\t\n\tMenambahkan Proses dan Blok Memori ]",//26
            "\t> Proses Ukuran Memori ",//27
            "\t> Ukuran Blok Memori ",//28
            "\n\tProses Seselai...\n\n\t1> Mengulang Algoritma ini\n\t2> Ke Menu Utama\n\t3> Keluar Program\n\t"+
            		"Masukan pilihan anda disini :",//29
            "\n\t[ Terima Kasih Telah Menggunakan Program Ini :) ]",//30
            "\n\t[ Pengaturan Proses ]\n\t> Berapa Proses yang anda inginkan ? : ",//31
            "\n\t[ Proses Ukuran Memory & Waktu ]",//32
            "\t> Ukuran Memori(KB) Proses ",//33
            " dari ",//34
            "\t> Waktu Memori(ms)  Proses ", //35
            "\n\t[ Pengaturan Memori ]\n\t> Berapa banyak Blok Memori yang anda inginkan ? : ",//36
            "\n\t[ Ukuran Blok Memori ]\n",//37
            "\t> Ukuran Memori(KB) untuk Block ",//38
            "\n\tProses Selesai...\n\n\t1> Mengulang Algoritma ini\n\t2> Ke Menu Utama\n\t3> Keluar Program\n\t",//39==29
            //======================
            "\n\t[ Hasil Statistik Penggunaan First Fit ]\n\n",//40
            "\n\n\t|======================================|"+
            "\n\t| Proses Alokasi Memori ke Blok Memori |"+
            "\n\t|======================================|",//41
            "\n\tNo.Proses\t\t\t\t: ",//42
            "\n\tProses Memory\t\t\t\t: ",//43
            "\n\tAlokasi ke Blok Memori ke\t\t: ",//44
            "\n\tAlokasi ke Blok Memori ke\t\t: Null",//45
            "\n\t---------------------------------------------------",//46
            "\n\tNo.Blok Memori\t\t\t\t: ",//47
            "\n\tUkuran Blok Memori\t\t\t: ",//48
            "\n\t[ Blok Memori Belum Dialokasikan ]",//49
            "\n\tBlok Memori Setelah Dialokasikan\t: " ,//50
            "\n\tWaktu Proses\t\t\t\t: ",//51
            " milidetik",//52
            "\n\t****************************************************************",//53
            "\n\tDiluar Memori !...\n\tMelanjutkan dengan proses proses yang berhasil ke Blok Memori",//54
            "\n\t[ Hasil Statistik Penggunaan Best Fit ]\n\n",//55
            "\n\t[ Hasil Statistik Penggunaan Worst Fit ]\n\n",//56
            "\n\t[ Hasil Statistik Penggunaan Next Fit ]\n\t>Last Memory Block Used : ",//57
            "\n\n\t|===============================================|"+
            "\n\t| Penyelesaian Proses dan Pelepasan Blok Memori |"+
            "\n\t|===============================================|",//58
            "\n\t>Penyelesaian Proses No ",//59
            " dalam ",//60
            "\n\t[ Pelepasan Memori ]\n\t>Blok Memori No\t\t: ",//61
            "\n\t>Ukuran Sekarang\t: ",//62
            " KB\n\t>Setelah Pelepasan\t: ",//63
            "\n\t-------------------------------------------------------------------",//64
            "\n\n\t[ Status Memori Sekarang ]",//65
            "\n\t>No.Blok Memori\t\t: ",//66
            "\n\tUkuran Blok Memori\t: ",//67
            "\n\t--------------------------------------",//68
            "\n\tDimana Posisi Terakhir Blok Memori\t: ",//69
            "\n\n\n\t Kami Mohon Maaf :(\n\tKarena Keterbatasan Pengetahuan kami tentang Bahasa Pemerograman java dan Waktu Pengerjaan\n\tBuddy System Hanya Tersedia dalam versi Bahasa Program C\n\tKami Telah Melampirkan file .C bersama file java ini \n\tAnda Dapat MengKompilasi dan Jalankan itu\n\tTerima Kasih Untuk Pengertiannya...\n\n\n"//70
        
        }
    };
}
