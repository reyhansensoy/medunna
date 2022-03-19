package utilities;

import pojos.Appointment;
import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToTxt {



    public static void saveRegistrantData(Registrant registrant){
         try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("make_appointment"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void saveRegistrantData(Registrant [] registrants){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("api_all_registrant_data"), false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for(int i=0; i< registrants.length;i++) {
                writer.append(registrants[i].getFirstName()+","+ registrants[i].getLastName()+","+registrants[i].getSsn()+","+ registrants[i].getLogin()+
                        registrants[i].getId()+","+registrants[i].getEmail()+ "\n");
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    public static void saveRegistrantData(Appointment appointment){
        try{
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("make_appointment"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(appointment+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveAppointData(Appointment appointment){

        try{

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment+"\n");


            writer.close();



        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
