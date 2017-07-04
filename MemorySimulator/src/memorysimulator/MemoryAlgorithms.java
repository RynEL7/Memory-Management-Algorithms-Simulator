package memorysimulator;

public class MemoryAlgorithms extends Thread
{
    static int i,j;
    static boolean memFull=false;
    static int MinMemory,MemIndex=0,MaxMemory;
    static int[] sortindex;
    static int[] tempstat,tempstatmem,tempstatproc;
    static int tempx;
    static int[] sortlt,templt;
    static int lastMemBlock;
    static int LangIndex=MemorySimulator.LangIndex;
    
    //Important Atr
    
    static int Proc;
    static int[] ProcMem;
    static int MemBlock;
    static int[] MemBlockSize;
    static int[] LifeTime;
    
    //main algorithm
    
    public static void FirstFit()
    {
        
        tempstat=new int[MemBlock];
        sortlt=new int[Proc];
        templt=new int[Proc];
        tempstatproc=new int[Proc];
        
        System.out.print(Language.LangResources[LangIndex][40]);
        
        for (j = 0; j < MemBlock; j++) 
        {
            tempstat[j] = MemBlockSize[j];
        }
        for (j = 0; j < Proc; j++) 
        {
            templt[j] = LifeTime[j];
        }

        
        //Added Process to Memory
        System.out.print(Language.LangResources[LangIndex][41]);
        for (i=0;i<Proc;i++)
        {
            System.out.print(Language.LangResources[LangIndex][42]+(i+1)+Language.LangResources[LangIndex][43]+ProcMem[i]+" KB");
            for (j=0;j<MemBlock;j++)
            {
                if (ProcMem[i]<=MemBlockSize[j])
                {
                    MemBlockSize[j]-=ProcMem[i];
                    tempstatproc[i]=j;
                    System.out.println(Language.LangResources[LangIndex][44]+(j+1));
                    memFull=false;
                    break;
                }
                else
                {
                    if (j==(MemBlock-1))
                    {
                        System.out.println(Language.LangResources[LangIndex][45]);
                        memFull=true;
                    }
                }
                
            }
            if (memFull == false) 
            {
                System.out.print(Language.LangResources[LangIndex][46]);
                for (j = 0; j < MemBlock; j++) 
                {
                    System.out.print(Language.LangResources[LangIndex][47]+ (j + 1) + Language.LangResources[LangIndex][48] + tempstat[j]+" KB");
                    if (tempstat[j]==MemBlockSize[j])
                    {
                        System.out.print(Language.LangResources[LangIndex][49]);
                    }
                    else
                    {
                        System.out.print(Language.LangResources[LangIndex][50]+ MemBlockSize[j] + " KB");
                    }
                    System.out.print(Language.LangResources[LangIndex][46]);
                }
                System.out.print(Language.LangResources[LangIndex][51] + LifeTime[i] + Language.LangResources[LangIndex][52]);
                System.out.print(Language.LangResources[LangIndex][53]);
                
            }
            else
            {
                System.out.println(Language.LangResources[LangIndex][54]);
                break;
            }
            
        }
        Proc=i;
        Finishing();
        
        
    }
    
    public static void BestFit()
    { 
        tempstat=new int[MemBlock];
        tempstatmem=new int[MemBlock];
        sortindex=new int[MemBlock];
        sortlt=new int[Proc];
        templt=new int[Proc];
        tempstatproc=new int[Proc];
        
        
        System.out.print(Language.LangResources[LangIndex][55]);
        
        for (i = 0; i < MemBlock; i++) {
            tempstatmem[i] = MemBlockSize[i];
        }
        for (i = 0; i < MemBlock; i++) 
        {
            tempstat[i] = MemBlockSize[i];
        }
        
        for (j = 0; j < Proc; j++) 
        {
            templt[j] = LifeTime[j];
        }
        
        //Finding Available Minimum Memory...
        for (i = 0; i < MemBlock; i++) 
        {
            for (j=i;j<MemBlock;j++)
            {
                if (tempstat[j]<=tempstat[i])
                {
                    tempx=tempstat[j];
                    tempstat[j]=tempstat[i];
                    tempstat[i]=tempx;
                }
            }
        }
        for (i = 0; i < MemBlock; i++) 
        {
            j=0;
            do
            {
                if(tempstat[i]==MemBlockSize[j])
                {
                    sortindex[i]=j;
                    break;
                }
                else
                {
                    j+=1;
                }
            }while(j<MemBlock);
        }
        
        System.out.print(Language.LangResources[LangIndex][41]);
        for (i=0;i<Proc;i++)
        {
            System.out.print(Language.LangResources[LangIndex][42]+ (i + 1) + Language.LangResources[LangIndex][43] + ProcMem[i] + " KB");
           
            
            j=0;
            do
            {
                if (ProcMem[i] <= MemBlockSize[sortindex[j]]) 
                {
                    MemBlockSize[sortindex[j]] -= ProcMem[i];
                    System.out.println(Language.LangResources[LangIndex][44]+(sortindex[j]+1));
                    tempstatproc[i]=sortindex[j];
                    memFull = false;
                    break;
                }
                else
                {
                    j+=1;
                }
                
            }while(j<(MemBlock));
            if(j>=MemBlock)
            {        
                memFull=true;
            }
            
            if (memFull == false) 
            {

                System.out.print(Language.LangResources[LangIndex][46]);
                for (j = 0; j < MemBlock; j++) 
                {
                    System.out.print(Language.LangResources[LangIndex][47]+ (j + 1) + Language.LangResources[LangIndex][48] + tempstatmem[j] + " KB");
                    if (tempstatmem[j] == MemBlockSize[j]) 
                    {
                        System.out.print(Language.LangResources[LangIndex][49]);
                    }else 
                    {
                        System.out.print(Language.LangResources[LangIndex][50] + MemBlockSize[j] + " KB");
                    }
                    System.out.print(Language.LangResources[LangIndex][46]);
                }
                
                System.out.print(Language.LangResources[LangIndex][51] + LifeTime[i] + Language.LangResources[LangIndex][52]);
                System.out.print(Language.LangResources[LangIndex][53]);
            } else 
            {
                System.out.println(Language.LangResources[LangIndex][54]);
                break;

            }
        }
        
        Proc=i;
        Finishing();
        

    }
    
    public static void WorstFit()
    {
        tempstat=new int[MemBlock];
        tempstatmem=new int[MemBlock];
        sortindex=new int[MemBlock];
        sortlt=new int[Proc];
        templt=new int[Proc];
        tempstatproc=new int[Proc];
        
        
        System.out.print(Language.LangResources[LangIndex][56]);
        
        for (i = 0; i < MemBlock; i++) {
            tempstatmem[i] = MemBlockSize[i];
        }
        for (i = 0; i < MemBlock; i++) 
        {
            tempstat[i] = MemBlockSize[i];
        }
        
        for (j = 0; j < Proc; j++) 
        {
            templt[j] = LifeTime[j];
        }
        
        //Finding Available Minimum Memory...
        for (i = 0; i < MemBlock; i++) 
        {
            for (j=i;j<MemBlock;j++)
            {
                if (tempstat[j]>=tempstat[i])
                {
                    tempx=tempstat[j];
                    tempstat[j]=tempstat[i];
                    tempstat[i]=tempx;
                }
            }
        }
        for (i = 0; i < MemBlock; i++) 
        {
            j=0;
            do
            {
                if(tempstat[i]==MemBlockSize[j])
                {
                    sortindex[i]=j;
                    break;
                }
                else
                {
                    j+=1;
                }
            }while(j<MemBlock);
        }
        
        System.out.print(Language.LangResources[LangIndex][41]);
        for (i=0;i<Proc;i++)
        {
            System.out.print(Language.LangResources[LangIndex][42] + (i + 1) + Language.LangResources[LangIndex][43] + ProcMem[i] + " KB");
           
            
            j=0;
            do
            {
                if (ProcMem[i] <= MemBlockSize[sortindex[j]]) 
                {
                    MemBlockSize[sortindex[j]] -= ProcMem[i];
                    System.out.println(Language.LangResources[LangIndex][44]+(sortindex[j]+1));
                    tempstatproc[i]=sortindex[j];
                    memFull = false;
                    break;
                }
                else
                {
                    j+=1;
                }
                
            }while(j<(MemBlock));
            if(j>=MemBlock)
            {        
                memFull=true;
            }
            
            if (memFull == false) 
            {

                System.out.print(Language.LangResources[LangIndex][46]);
                for (j = 0; j < MemBlock; j++) 
                {
                    System.out.print(Language.LangResources[LangIndex][47] + (j + 1) + Language.LangResources[LangIndex][48] + tempstatmem[j] + " KB");
                    if (tempstatmem[j] == MemBlockSize[j]) 
                    {
                        System.out.print(Language.LangResources[LangIndex][49]);
                    }else 
                    {
                        System.out.print(Language.LangResources[LangIndex][50] + MemBlockSize[j] + " KB");
                    }
                    System.out.print(Language.LangResources[LangIndex][46]);
                }
                
                System.out.print(Language.LangResources[LangIndex][51] + LifeTime[i] + Language.LangResources[LangIndex][52]);
                System.out.print(Language.LangResources[LangIndex][53]);
            } else 
            {
                System.out.println(Language.LangResources[LangIndex][54]);
                break;

            }
        }
        
        Proc=i;
        Finishing();
        
    }
    
    public static void NextFit()
    {
        tempstat=new int[MemBlock];
        sortlt=new int[Proc];
        templt=new int[Proc];
        tempstatproc=new int[Proc];
        
        System.out.print(Language.LangResources[LangIndex][57]+lastMemBlock);
        
        for (j = 0; j < MemBlock; j++) 
        {
            tempstat[j] = MemBlockSize[j];
        }
        for (j = 0; j < Proc; j++) 
        {
            templt[j] = LifeTime[j];
        }

        //Added Process to Memory
        System.out.print(Language.LangResources[LangIndex][41]);
        for (i=0;i<Proc;i++)
        {
            System.out.print(Language.LangResources[LangIndex][42]+(i+1)+Language.LangResources[LangIndex][43]+ProcMem[i]+" KB");
            for (j=lastMemBlock;j<MemBlock;j++)
            {
                if (ProcMem[i]<=MemBlockSize[j])
                {
                    MemBlockSize[j]-=ProcMem[i];
                    tempstatproc[i]=j;
                    System.out.println(Language.LangResources[LangIndex][44]+(j+1));
                    memFull=false;
                    break;
                }
                else
                {
                    if (j==(MemBlock-1))
                    {
                        System.out.println(Language.LangResources[LangIndex][45]);
                        memFull=true;
                    }
                }
                
            }
            if (memFull == false) 
            {
                System.out.print(Language.LangResources[LangIndex][46]);
                for (j = 0; j < MemBlock; j++) 
                {
                    System.out.print(Language.LangResources[LangIndex][47] + (j + 1) + Language.LangResources[LangIndex][48] + tempstat[j]+" KB");
                    if (tempstat[j]==MemBlockSize[j])
                    {
                        System.out.print(Language.LangResources[LangIndex][49]);
                    }
                    else
                    {
                        System.out.print(Language.LangResources[LangIndex][50]+ MemBlockSize[j] + " KB");
                    }
                    System.out.print(Language.LangResources[LangIndex][46]);
                }
                System.out.print(Language.LangResources[LangIndex][51]+ LifeTime[i] + Language.LangResources[LangIndex][52]);
                System.out.print(Language.LangResources[LangIndex][53]);
                
            }
            else
            {
                System.out.println(Language.LangResources[LangIndex][54]);
                break;
            }
            
        }
        Proc=i;
        Finishing();
        
    }

    public static void BuddySystem()
    {
        System.out.println(Language.LangResources[LangIndex][70]);
    }
    
    //Additional Fuction to Algorithm
    public static void Finishing()
    {
        //Finishing Process
        System.out.print(Language.LangResources[LangIndex][58]);
        
            for (i = 0; i < Proc; i++) 
            {
                for (j=i;j<Proc;j++)
                {
                    if (LifeTime[j]<=LifeTime[i])
                    {
                        tempx=LifeTime[j];
                        LifeTime[j]=LifeTime[i];
                        LifeTime[i]=tempx;
                    }
                }
            }
            
            for (i = 0; i < Proc; i++) 
            {
                j=0;
                do
                {
                    if(LifeTime[i]==templt[j])
                    {
                        sortlt[i]=j;
                        break;
                    }
                    else
                    {
                        j+=1;
                    }
                }while(j<Proc);
            }
            
            for (i=0;i<Proc;i++)
            {
                try 
                {
                    Thread.sleep(LifeTime[i]);
                    System.out.print(Language.LangResources[LangIndex][59]+(sortlt[i]+1)+Language.LangResources[LangIndex][60]+LifeTime[i]+Language.LangResources[LangIndex][52]);
                    tempx=MemBlockSize[tempstatproc[sortlt[i]]];
                    MemBlockSize[tempstatproc[sortlt[i]]]+=ProcMem[sortlt[i]];
                    System.out.print(Language.LangResources[LangIndex][61]+(tempstatproc[sortlt[i]]+1)+Language.LangResources[LangIndex][62]+tempx+Language.LangResources[LangIndex][63]+MemBlockSize[tempstatproc[sortlt[i]]]+" KB");
                   
                } catch (InterruptedException e) 
                {
                    return;
                }
                
                System.out.print(Language.LangResources[LangIndex][64]);
            }
            
            
            System.out.print(Language.LangResources[LangIndex][65]);
            for (i=0;i<MemBlock;i++)
            {
                System.out.print(Language.LangResources[LangIndex][66]+(i+1)+Language.LangResources[LangIndex][67]+MemBlockSize[i]+" KB"+Language.LangResources[LangIndex][68]);
            }
    }
}

