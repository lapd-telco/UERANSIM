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

public class NGAP_InitialContextSetupFailure extends NGAP_BaseMessage {

    public NGAP_InitialContextSetupFailure() {

    }

    @Override
    public NgapMessageType getMessageType() {
        return NgapMessageType.InitialContextSetupFailure;
    }

    @Override
    public NgapProtocolIeType getProtocolIeType() {
        return NgapProtocolIeType.forMessage("InitialContextSetupFailure");
    }

    @Override
    public int getCriticality() {
        return 0;
    }

    @Override
    public int getProcedureCode() {
        return 14;
    }

    @Override
    public int getPduType() {
        return 2;
    }

    @Override
    public int[] getIeId() {
        return new int[]{10, 85, 132, 15, 19};
    }

    @Override
    public int[] getIeCriticality() {
        return new int[]{1, 1, 1, 1, 1};
    }

    @Override
    public Class<? extends NGAP_Value>[] getIeTypes() {
        return new Class[]{NGAP_AMF_UE_NGAP_ID.class, NGAP_RAN_UE_NGAP_ID.class, NGAP_PDUSessionResourceFailedToSetupListCxtFail.class, NGAP_Cause.class, NGAP_CriticalityDiagnostics.class};
    }

    @Override
    public int[] getIePresence() {
        return new int[]{2, 2, 0, 2, 0};
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
        return "InitialContextSetupFailure";
    }

    @Override
    public String getXmlTagName() {
        return "InitialContextSetupFailure";
    }

}
