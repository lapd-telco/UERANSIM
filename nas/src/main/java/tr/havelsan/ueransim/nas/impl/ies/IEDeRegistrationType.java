/*
 * MIT License
 *
 * Copyright (c) 2020 ALİ GÜNGÖR
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * @author Ali Güngör (aligng1620@gmail.com)
 */

package tr.havelsan.ueransim.nas.impl.ies;

import tr.havelsan.ueransim.nas.core.ProtocolEnum;
import tr.havelsan.ueransim.nas.core.ies.InformationElement1;
import tr.havelsan.ueransim.utils.bits.Bit4;
import tr.havelsan.ueransim.utils.octets.Octet;

public class IEDeRegistrationType extends InformationElement1 {
    public EDeRegistrationAccessType accessType;
    public EReRegistrationRequired reRegistrationRequired;
    public ESwitchOff switchOff;

    public IEDeRegistrationType() {
    }

    public IEDeRegistrationType(EDeRegistrationAccessType accessType, EReRegistrationRequired reRegistrationRequired, ESwitchOff switchOff) {
        this.accessType = accessType;
        this.reRegistrationRequired = reRegistrationRequired;
        this.switchOff = switchOff;
    }

    @Override
    public IEDeRegistrationType decodeIE1(Bit4 value) {
        var res = new IEDeRegistrationType();
        res.accessType = EDeRegistrationAccessType.fromValue(value.getBitRangeI(0, 1));
        res.reRegistrationRequired = EReRegistrationRequired.fromValue(value.getBitI(2));
        res.switchOff = ESwitchOff.fromValue(value.getBitI(3));
        return res;
    }

    @Override
    public int encodeIE1() {
        var value = new Octet();
        value = value.setBitRange(0, 1, accessType.intValue());
        value = value.setBit(2, reRegistrationRequired.intValue());
        value = value.setBit(3, switchOff.intValue());
        return value.intValue();
    }

    public static class ESwitchOff extends ProtocolEnum {
        public static final ESwitchOff NORMAL_DE_REGISTRATION
                = new ESwitchOff(0b0, "Normal de-registration");
        public static final ESwitchOff SWITCH_OFF
                = new ESwitchOff(0b1, "Switch off");

        private ESwitchOff(int value, String name) {
            super(value, name);
        }

        public static ESwitchOff fromValue(int value) {
            return fromValueGeneric(ESwitchOff.class, value, null);
        }
    }

    public static class EDeRegistrationAccessType extends ProtocolEnum {
        public static final EDeRegistrationAccessType THREEGPP_ACCESS
                = new EDeRegistrationAccessType(0b01, "3GPP access");
        public static final EDeRegistrationAccessType NON_THREEGPP_ACCESS
                = new EDeRegistrationAccessType(0b10, "Non-3GPP access");
        public static final EDeRegistrationAccessType THREEGPP_ACCESS_AND_NON_THREEGPP_ACCESS
                = new EDeRegistrationAccessType(0b11, "3GPP access and non-3GPP access");

        private EDeRegistrationAccessType(int value, String name) {
            super(value, name);
        }

        public static EDeRegistrationAccessType fromValue(int value) {
            return fromValueGeneric(EDeRegistrationAccessType.class, value, null);
        }
    }

    public static class EReRegistrationRequired extends ProtocolEnum {
        public static final EReRegistrationRequired NOT_REQUIRED
                = new EReRegistrationRequired(0b0, "re-registration not required");
        public static final EReRegistrationRequired REQUIRED
                = new EReRegistrationRequired(0b1, "re-registration required");

        private EReRegistrationRequired(int value, String name) {
            super(value, name);
        }

        public static EReRegistrationRequired fromValue(int value) {
            return fromValueGeneric(EReRegistrationRequired.class, value, null);
        }
    }
}
