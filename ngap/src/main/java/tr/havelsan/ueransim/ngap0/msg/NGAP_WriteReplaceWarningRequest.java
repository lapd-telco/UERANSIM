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

public class NGAP_WriteReplaceWarningRequest extends NGAP_BaseMessage {

    public NGAP_WriteReplaceWarningRequest() {

    }

    @Override
    public NgapMessageType getMessageType() {
        return NgapMessageType.WriteReplaceWarningRequest;
    }

    @Override
    public NgapProtocolIeType getProtocolIeType() {
        return NgapProtocolIeType.forMessage("WriteReplaceWarningRequest");
    }

    @Override
    public int getCriticality() {
        return 0;
    }

    @Override
    public int getProcedureCode() {
        return 51;
    }

    @Override
    public int getPduType() {
        return 0;
    }

    @Override
    public int[] getIeId() {
        return new int[]{35, 95, 122, 87, 47, 125, 124, 20, 123, 17, 141};
    }

    @Override
    public int[] getIeCriticality() {
        return new int[]{0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1};
    }

    @Override
    public Class<? extends NGAP_Value>[] getIeTypes() {
        return new Class[]{NGAP_MessageIdentifier.class, NGAP_SerialNumber.class, NGAP_WarningAreaList.class, NGAP_RepetitionPeriod.class, NGAP_NumberOfBroadcastsRequested.class, NGAP_WarningType.class, NGAP_WarningSecurityInfo.class, NGAP_DataCodingScheme.class, NGAP_WarningMessageContents.class, NGAP_ConcurrentWarningMessageInd.class, NGAP_WarningAreaCoordinates.class};
    }

    @Override
    public int[] getIePresence() {
        return new int[]{2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0};
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
        return "WriteReplaceWarningRequest";
    }

    @Override
    public String getXmlTagName() {
        return "WriteReplaceWarningRequest";
    }

}
