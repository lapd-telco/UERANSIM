package tr.havelsan.ueransim.ngap0.ies.choices;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

import java.util.List;

public class NGAP_UP_TNLInformation extends NGAP_Choice {

    public NGAP_SingleTNLInformation singleTNLInformation;
    public NGAP_MultipleTNLInformation multipleTNLInformation;

    @Override
    public String getAsnName() {
        return "UP-TNLInformation";
    }

    @Override
    public String getXmlTagName() {
        return "UP-TNLInformation";
    }

    @Override
    public String[] getMemberNames() {
        return new String[]{"singleTNLInformation", "multipleTNLInformation"};
    }

    @Override
    public String[] getMemberIdentifiers() {
        return new String[]{"singleTNLInformation", "multipleTNLInformation"};
    }
}
