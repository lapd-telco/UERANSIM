package tr.havelsan.ueransim.ngap0.msg;

import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

public class NGAP_CellTrafficTrace extends NGAP_BaseMessage {

    public NGAP_CellTrafficTrace() {

    }

    @Override
    public NgapMessageType getMessageType() {
        return NgapMessageType.CellTrafficTrace;
    }

    @Override
    public NgapProtocolIeType getProtocolIeType() {
        return NgapProtocolIeType.forMessage("CellTrafficTrace");
    }

    @Override
    public int getCriticality() {
        return 1;
    }

    @Override
    public int getProcedureCode() {
        return 2;
    }

    @Override
    public int getPduType() {
        return 0;
    }

    @Override
    public int[] getIeId() {
        return new int[]{10, 85, 44, 43, 109};
    }

    @Override
    public int[] getIeCriticality() {
        return new int[]{0, 0, 1, 1, 1};
    }

    @Override
    public Class<? extends NGAP_Value>[] getIeTypes() {
        return new Class[]{NGAP_AMF_UE_NGAP_ID.class, NGAP_RAN_UE_NGAP_ID.class, NGAP_NGRANTraceID.class, NGAP_NGRAN_CGI.class, NGAP_TransportLayerAddress.class};
    }

    @Override
    public int[] getIePresence() {
        return new int[]{2, 2, 2, 2, 2};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"protocolIEs"};
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"protocolIEs"};
    }

    @Override
    public String getAsnName() {
        return "CellTrafficTrace";
    }

    @Override
    public String getXmlTagName() {
        return "CellTrafficTrace";
    }

}
