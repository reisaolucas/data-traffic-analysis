/*
 * A record is a line from the csv file, that corresponds to the information contained in a packet header.
 * It has all the attributes listed below.
 */
package model;

/**
 *
 * @author reisaolucas
 */
public class Record {
    
    private String ts;
    private String te;
    private String td;
    private String sourceAddress;
    private String destinationAddress;
    private String sourcePort;
    private String destinationPort;
    private String protocol;
    private String flag;
    private String inPackets;
    private String inBytes;
    
    public Record(String ts, String te, String td, String sourceAddress, String destinationAddress, 
            String sourcePort, String destinationPort, String protocol, String flag, String inPackets, 
            String inBytes){
        
        this.ts = ts;
        this.te = te;
        this.td = td;
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.sourcePort = sourcePort;
        this.destinationPort = destinationPort;
        this.protocol = protocol;
        this.flag = flag;
        this.inPackets = inPackets;
        this.inBytes = inBytes;
    }
    
    public Record (){}
    
    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getInPackets() {
        return inPackets;
    }

    public void setInPackets(String inPackets) {
        this.inPackets = inPackets;
    }

    public String getInBytes() {
        return inBytes;
    }

    public void setInBytes(String inBytes) {
        this.inBytes = inBytes;
    }

            
}
