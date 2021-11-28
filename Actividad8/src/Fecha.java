import java.util.Scanner;

public class Fecha
{
    int dia;
    int mes;
    int año;
    Scanner entrada = new Scanner(System.in);

    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(int dia, int mes)
    {
        this.dia = dia;
        this.mes = mes;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public int getAño()
    {
        return año;
    }

    public void setAño(int año)
    {
        this.año = año;
    }

    void fechaCorrecta()
    {
        System.out.println("Introduzca el dia, mes y año");

        dia = entrada.nextInt();
        mes = entrada.nextInt();
        año = entrada.nextInt();

        if((dia>0)&&(dia<31))
        {
            System.out.println("Dia OK");
            if((mes>0)&&(mes<13))
            {
                System.out.println("Mes OK");
                if((año>0))
                {
                    System.out.println("Año OK");
                    System.out.println("La fecha es " + dia + "/" + mes + "/" + año);
                }
                else
                {
                    System.out.println("Año NOT OK");
                }
            }else
            {
                System.out.println("Mes NOT OK");
            }
        }else
        {
            System.out.println("Dia NOT OK");
        }
    }
}
