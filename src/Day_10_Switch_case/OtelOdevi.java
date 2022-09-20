package Day_10_Switch_case;

import java.util.Scanner;

public class OtelOdevi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----OTELIMIZE HOSGEDINIZ-----");
        System.out.println("1.kat : Resepsion-Guvenlik-Oda hizmetleri\n" + "2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n" + "3.kat : Room3-Room4-Room5-Room6");
        System.out.println("Lutfen motelimizi tanimak icin 1-2-3 bir kat giriniz ve oda adi seciniz: ");
        int katSayısı = scan.nextInt();
        scan.nextLine();
        String odaAdı = scan.nextLine();
        switch (katSayısı) {
            case 1:
                switch (odaAdı) {
                    case "reception":
                        System.out.println("Resepsion: Tum  islemleriniz icin bekleriz");
                        break;
                    case "güvenlik":
                        System.out.println("Guvenlik: professiyonel bir hizmettir.");
                        break;
                    case "oda hizmetleri":
                        System.out.println("Oda Hizmetleri: temizlik ve tasima hizmetleri icin 101 dahili hattan ulasabilirsiniz");
                        break;
                    default:
                        System.out.println("Boyle bir oda yok");

                }
                break;

            case 2:
                switch (odaAdı) {
                    case "yemekhane":
                        System.out.println("Yemekhane:  Kahvalti 08-11\n" + "Ogle yemegi 12-15\n" + "Aksam yemegi 18-21");
                        break;
                    case "dinlenme salonu":
                        System.out.println("Dinlenme salonu : 24 saat cay servisi ile hizmetinizdedir");
                        break;
                    case "room1":
                        System.out.println("Room1  : ekonomik oda");
                        break;
                    case "room2":
                        System.out.println("Room2: ekonomik oda");
                        break;
                    default:
                        System.out.println("Boyle bir oda yok");
                }
                break;

            case 3:
                switch (odaAdı) {
                    case "room3":
                        System.out.println("Room3-:  standart oda\n");
                        break;
                    case "room4":
                        System.out.println("Room4: standart oda\n");
                        break;
                    case "room5":
                        System.out.println("Room5:  ozel oda");
                        break;
                    case "room6":
                        System.out.println("Room5: Ozel oda");
                        break;
                    default:
                        System.out.println("Boyle bir oda yok");
                }
                break;
            default:
                System.out.println("OTELIMIZ 3 KATLIDIR.");
                break;

        }

    }


}





































































