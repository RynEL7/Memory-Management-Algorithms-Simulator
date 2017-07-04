package memorysimulator;

import java.util.Scanner;
import java.util.Random;

public class MemorySimulator extends Thread
{

    static byte LangIndex = 0;
    static byte SimulatorMode = 0;
    static byte AlgIndex=0;
    static int Proc;
    static int ProcMem[];
    static int MemBlock=1;
    static int MemBlockSize[];
    static int LifeTime[];
    static int SleepTime;
    static Scanner scan = new Scanner(System.in);
    static int i,j;
    static int SubMenu=0;
    static int lastMemBlock;
    static byte temp=0;
    
    static Random rand;

    public static void main(String[] args) 
    {
        LanguageMenu();
    }
 
    public static void LanguageMenu() 
    {
        //Choosing Program Language
        System.out.println(Language.LangResources[LangIndex][0]+Language.LangResources[LangIndex][20]);
        System.out.print(Language.LangResources[LangIndex][17]);
        LangIndex = scan.nextByte();
        LangIndex-=1;
        if (LangIndex==0 || LangIndex==1)
        {
            clr();
            temp=LangIndex;
            MainMenu();
        }
        else if (LangIndex==2)
        {
            clr();
            LangIndex=temp;
            System.out.println(Language.LangResources[LangIndex][18]);
            System.exit(0);
        }
        else
        {
            LangIndex=temp;
            System.out.println(Language.LangResources[LangIndex][19]);
            LanguageMenu();
        }
        
    }

    public static void MainMenu() 
    {
        do
        {
            System.out.println("\n\t" + Language.LangResources[LangIndex][0]+Language.LangResources[LangIndex][1]);
            System.out.print(Language.LangResources[LangIndex][2]+"\n\t"+Language.LangResources[LangIndex][3]);
            SimulatorMode=scan.nextByte();
            if (SimulatorMode==1)
            {
                do
                {
                    clr();
                    System.out.print("\n\t"+Language.LangResources[LangIndex][4]+"\n\t"+Language.LangResources[LangIndex][6]+"\n\t"+Language.LangResources[LangIndex][5]+"\n\t"+Language.LangResources[LangIndex][3]);
                    AlgIndex=scan.nextByte();
                    
                    if (AlgIndex==1)
                    {
                        clr();
                        AutoModeProcess("FirstFit");
                        break;
                    }
                    else if (AlgIndex==2)
                    {
                        clr();
                        AutoModeProcess("BestFit");
                        break;
                        
                    }
                    else if (AlgIndex==3)
                    {
                        clr();
                        AutoModeProcess("WorstFit");
                        break;
                    }
                    else if (AlgIndex==4)
                    {
                        clr();
                        AutoModeProcess("NextFit");
                        break;
                        
                    }
                    else if (AlgIndex==5)
                    {
                        clr();
                        AutoModeProcess("BuddySystem");
                        break;
                        
                    }
                    else if (AlgIndex==6)
                    {
                        clr();
                        MainMenu();
                        break;
                    }
                    else if (AlgIndex==7)
                    {
                        
                        clr();
                        System.out.println(Language.LangResources[LangIndex][21]);
                        System.exit(0);
                        break;
                    }
                    else
                    {
                        System.out.println("\n\t"+Language.LangResources[LangIndex][7]);
                    }
                            
                }
                while(AlgIndex<1 || AlgIndex>7);
                break;
            }
            else if (SimulatorMode==2)
            {
                do
                {
                    clr();
                    System.out.print("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][5]+"\n\t"+Language.LangResources[LangIndex][3]);
                    AlgIndex=scan.nextByte();
                    if (AlgIndex==1)
                    {
                        clr();
                        ManualModeProcess("FirstFit");
                        break;
                    }
                    else if (AlgIndex==2)
                    {
                        clr();
                        ManualModeProcess("BestFit");
                        break;               
                    }
                    else if (AlgIndex==3)
                    {
                        clr();
                        ManualModeProcess("WorstFit");
                        break;
                    }
                    else if (AlgIndex==4)
                    {
                        clr();
                        ManualModeProcess("NextFit");
                        break;
                    }
                    else if (AlgIndex==5)
                    {
                        clr();
                        ManualModeProcess("BuddySystem");
                        break;
                        
                    }
                    else if (AlgIndex==6)
                    {
                        clr();
                        MainMenu();
                        break;
                    }
                    else if (AlgIndex==7)
                    {
                        clr();
                        System.out.println(Language.LangResources[LangIndex][21]);
                        System.exit(0);
                        break;
                    }
                    else
                    {
                        System.out.println("\n\t"+Language.LangResources[LangIndex][7]);
                    }            
                
                }while(AlgIndex<1 || AlgIndex>7);
                break;
            }
            else if (SimulatorMode==3)
            {
                System.out.println(Language.LangResources[LangIndex][22]);
                String[][] Authors=
                {
                    {
                        Language.LangResources[LangIndex][23],
                        Language.LangResources[LangIndex][24],
                        Language.LangResources[LangIndex][25],
                        Language.LangResources[LangIndex][25],
                        Language.LangResources[LangIndex][25],
                        "[Universitas Ibn Khaldun Bogor]",
                        "[Copyright 2015]"
                    },
                    {
                        "Riyan Saputra Irawan\t(141105151104)",
                        "Zainal Mubarok\t\t(141105151167)",
                        "M.Naufal Fahmi\t\t(141105150720)",
                        "Ghamal Nasser\t\t(141105150809)",
                        "Abdul EriSusanto\t\t(141205151454)"
                    }
                };
                for(i=0;i<5;i++)
                { 
                    System.out.print("\n\t" + Authors[0][i]);
                    try 
                    {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) 
                    {
                        return;
                    }
                    System.out.print("\n\t" + Authors[1][i]);
                }
                
                    System.out.print("\n\t" + Authors[0][5]);
                    System.out.print("\n\t\t" + Authors[0][6]+"\n\n");
                    
                MainMenu();
                break;
            }
            else if (SimulatorMode==4)
            {
                clr();
                LanguageMenu();
                break;
            }
            else if (SimulatorMode==5)
            {
                clr();
                System.out.println(Language.LangResources[LangIndex][30]);
                System.exit(0);
                break;
            }
            else
            {
                System.out.println("\n\t"+Language.LangResources[LangIndex][7]);
            }
        }
        while (SimulatorMode<1 || SimulatorMode>5);
    } 
    
    public static void AutoModeProcess(String Alg) 
    {
        rand = new Random();
        int MaxProcess=25;
        int MaxBlockMem=4;
        int MaxLifeTime=2000;
        int MaxSleepTime=500;
        
        if (Alg.equals("FirstFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][04]+"\n\t"+Language.LangResources[LangIndex][8]);
        } 
        if (Alg.equals("BestFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][04]+"\n\t"+Language.LangResources[LangIndex][9]);
        } 
        if (Alg.equals("WorstFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][04]+"\n\t"+Language.LangResources[LangIndex][10]);
        } 
        if (Alg.equals("NextFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][04]+"\n\t"+Language.LangResources[LangIndex][11]);
        } 
        if (Alg.equals("BuddySystem"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][04]+"\n\t"+Language.LangResources[LangIndex][12]);
        }
        
        if (Alg.equals("BuddySystem"))
        {
            MemoryAlgorithms.BuddySystem();
            MainMenu();
        }
        else
        {
            /*
             This Statements to Generate Processes and Memory
             Max Proceesses is 25 Process
             Max Memory Block is 4 Blocks
             Total Amount Memory Block is 1MB
             */
            System.out.println("\n\t" + Language.LangResources[LangIndex][16]);
            System.out.println(Language.LangResources[LangIndex][26]);

            //Generate MaxProccess
            do {
                Proc = rand.nextInt(MaxProcess);
            } while (Proc <= 0);
            ProcMem = new int[Proc];
            LifeTime = new int[Proc];

            //Generate MemoryBlocksSize
            i = 0;
            MemBlock = 4;
            MemBlockSize = new int[MemBlock];
            do {
                do {
                    MemBlockSize[i] = rand.nextInt(1024);
                } while (MemBlockSize[i] <= 0);
                i += 1;
                if (i == 4) {
                    if ((MemBlockSize[0] + MemBlockSize[1] + MemBlockSize[2] + MemBlockSize[3]) == 1024) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                }
            } while (i != 4);

            //Proccess Memory Blocks Needed
            for (i = 0; i < Proc; i++) {
                ProcMem[i] = rand.nextInt(4);
                switch (ProcMem[i]) {
                    case 0: {
                        ProcMem[i] = 10;
                        break;
                    }
                    case 1: {
                        ProcMem[i] = 20;
                        break;
                    }
                    case 2: {
                        ProcMem[i] = 40;
                        break;
                    }
                    case 3: {
                        ProcMem[i] = 60;
                        break;
                    }
                    default: {
                        ProcMem[i] = 60;
                        break;
                    }
                }
                System.out.println(Language.LangResources[LangIndex][27] + (i + 1) + " :" + ProcMem[i] + " KB");
                //Generate LifeTime Process
                LifeTime[i] = rand.nextInt(MaxLifeTime);

            }
            for (i = 0; i < MemBlock; i++) {
                System.out.println(Language.LangResources[LangIndex][28] + (i + 1) + " : " + MemBlockSize[i] + " KB");
            }
            /*
             END OF GENERATING...
             */
            //Processes 
            MemoryAlgorithms.Proc = Proc;
            MemoryAlgorithms.ProcMem = ProcMem;
            MemoryAlgorithms.MemBlock = MemBlock;
            MemoryAlgorithms.MemBlockSize = MemBlockSize;
            MemoryAlgorithms.LifeTime = LifeTime;
            MemoryAlgorithms.LangIndex = LangIndex;
            if (Alg.equals("FirstFit")) {
                MemoryAlgorithms.FirstFit();
            }
            if (Alg.equals("BestFit")) {
                MemoryAlgorithms.BestFit();
            }
            if (Alg.equals("WorstFit")) {
                MemoryAlgorithms.WorstFit();
            }
            if (Alg.equals("NextFit")) {
                do {
                    lastMemBlock = rand.nextInt(MemBlock);
                } while (lastMemBlock < 0 || lastMemBlock >= (MemBlock - 1));
                MemoryAlgorithms.lastMemBlock = (lastMemBlock + 1);

                MemoryAlgorithms.NextFit();
            }

            do {
                System.out.print(Language.LangResources[LangIndex][29]);
                SubMenu = scan.nextInt();
                if (SubMenu == 1) {
                    clr();
                    AutoModeProcess(Alg);
                    break;
                } else if (SubMenu == 2) {
                    clr();
                    MainMenu();
                    break;
                } else if (SubMenu == 3) {
                    clr();
                    System.out.println(Language.LangResources[LangIndex][30]);
                    System.exit(0);
                    break;
                } else {
                    System.out.println("\n\t" + Language.LangResources[LangIndex][7]);
                }

            } while (SubMenu < 1 || SubMenu > 3);

        }
        
    }
    
    public static void ManualModeProcess(String Alg)
    {
        
        if (Alg.equals("FirstFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][8]);
        }
        if(Alg.equals("BestFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][9]);
        }
        if (Alg.equals("WorstFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][10]);
        }
        if(Alg.equals("NextFit"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][11]);
        }
        if(Alg.equals("BuddySystem"))
        {
            System.out.println("\n\t"+Language.LangResources[LangIndex][13]+"\n\t"+Language.LangResources[LangIndex][12]);
        }
        
        if(Alg.equals("BuddySystem"))
        {
            MemoryAlgorithms.BuddySystem();
            MainMenu();
        }
        else
        {
            System.out.print(Language.LangResources[LangIndex][31]);
            Proc = scan.nextInt();
            ProcMem = new int[Proc];
            LifeTime = new int[Proc];
            System.out.println(Language.LangResources[LangIndex][32]);
            for (i = 0; i < Proc; i++) {
                System.out.print(Language.LangResources[LangIndex][33] + (i + 1) + Language.LangResources[LangIndex][34] + Proc + " :");
                ProcMem[i] = scan.nextInt();
                System.out.print(Language.LangResources[LangIndex][35] + (i + 1) + Language.LangResources[LangIndex][34] + Proc + " :");
                LifeTime[i] = scan.nextInt();
            }
            System.out.print(Language.LangResources[LangIndex][36]);
            MemBlock = scan.nextInt();
            MemBlockSize = new int[MemBlock];
            System.out.print(Language.LangResources[LangIndex][37]);
            for (i = 0; i < MemBlock; i++) {
                System.out.print(Language.LangResources[LangIndex][38] + (i + 1) + Language.LangResources[LangIndex][34] + MemBlock + " :");
                MemBlockSize[i] = scan.nextInt();
            }

            MemoryAlgorithms.Proc = Proc;
            MemoryAlgorithms.ProcMem = ProcMem;
            MemoryAlgorithms.MemBlock = MemBlock;
            MemoryAlgorithms.MemBlockSize = MemBlockSize;
            MemoryAlgorithms.LifeTime = LifeTime;
            MemoryAlgorithms.LangIndex = LangIndex;
            if (Alg.equals("FirstFit")) {
                MemoryAlgorithms.FirstFit();

            } else if (Alg.equals("BestFit")) {
                MemoryAlgorithms.BestFit();

            } else if (Alg.equals("WorstFit")) {
                MemoryAlgorithms.WorstFit();

            } else if (Alg.equals("NextFit")) 
            {
                do 
                {
                    System.out.print(Language.LangResources[LangIndex][69]);
                    lastMemBlock = scan.nextInt();
                    
                } while (lastMemBlock < 0 || lastMemBlock >= MemBlock );
                
                MemoryAlgorithms.lastMemBlock = lastMemBlock;
                MemoryAlgorithms.NextFit();

            }

            do {
                System.out.print(Language.LangResources[LangIndex][39]);
                SubMenu = scan.nextInt();
                if (SubMenu == 1) {
                    clr();
                    ManualModeProcess(Alg);
                    break;
                } else if (SubMenu == 2) {
                    clr();
                    MainMenu();
                    break;
                } else if (SubMenu == 3) {
                    clr();
                    System.out.println(Language.LangResources[LangIndex][30]);
                    System.exit(0);
                    break;
                } else {
                    System.out.println("\n\t" + Language.LangResources[LangIndex][7]);
                }

            } while (SubMenu < 1 || SubMenu > 3);
        }
        
        
    }
      
    public static void clr()
    {
        for (i=0;i<7;i++)
        {
            System.out.println();
        }
    }
}
