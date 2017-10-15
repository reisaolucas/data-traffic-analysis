/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Record;

/**
 *
 * @author reisaolucas
 */
public class csvDAO {
    public ArrayList<Record> records = new ArrayList<>();
    
    registers = getDataFromCsv ("output.csv");
    
    public ArrayList<Record> getDataFromCsv (fileCsv) throws IOException{
        FileReader reader = new FileReader(fileCsv);
        BufferedReader readerBuff = new BufferedReader(reader);
        String line;
        while((line = readerBuff.readLine())!=null){
            String [] registers = line.split(";");
            Record register = new Record();
            register.setTs(registers[0]);
            register.setTe(registers[1]);
            register.setTd(registers[2]);
            register.setSourceAddress(registers[3]);
            register.setDestinationAddress(registers[4]);
            register.setSourcePort(registers[5]);
            register.setDestinationPort(registers[6]);
            register.setProtocol(registers[7]);
            register.setFlag(registers[8]);
            register.setInPackets(registers[9]);
            register.setInBytes(registers[10]);
            this.records.add(register);   
        }
        readerBuff.close();
        for(int i=0; i<this.records.size(); i++){
            System.out.println("Ts: "+this.records.get(i).getTs()+
                    ", Te: "+this.records.get(i).getTe()+
                    ", Td: "+this.records.get(i).getTd()+
                    ", SourceAddress: "+this.records.get(i).getSourceAddress()+
                    ", DestinationAddress: "+this.records.get(i).getDestinationAddress()+
                    ", SourcePort: "+this.records.get(i).getSourcePort()+
                    ", DestinationPort: "+this.records.get(i).getDestinationPort()+
                    ", Protocol: "+this.records.get(i).getProtocol()+
                    ", Flag: "+this.records.get(i).getFlag()+
                    ", InPackets: "+this.records.get(i).getInPackets()+
                    ", InBytes: "+this.records.get(i).getInBytes());
        }
    }
}
