package com.runsim.backend.app.sim;

import com.runsim.backend.nas.core.ProtocolEnum;
import com.runsim.backend.nas.core.messages.NasMessage;

public class SimulationStep {
    public final ENgapType ngapType;
    public final NasMessage nasMessage;
    public final int sleep;

    public SimulationStep(ENgapType ngapType, NasMessage nasMessage, Integer sleep) {
        this.ngapType = ngapType;
        this.nasMessage = nasMessage;
        this.sleep = sleep == null ? 0 : sleep;
    }

    public static class ENgapType extends ProtocolEnum {
        public static final ENgapType INITIAL_UE_MESSAGE = new ENgapType(28, "InitialUEMessage");
        public static final ENgapType UPLINK_NAS_TRANSPORT = new ENgapType(76, "UplinkNASTransport");

        private ENgapType(int value, String name) {
            super(value, name);
        }

        public static ENgapType fromValue(int value) {
            return fromValueGeneric(ENgapType.class, value, null);
        }
    }
}
