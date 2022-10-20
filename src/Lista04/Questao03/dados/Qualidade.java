package Lista04.Questao03.dados;

public enum Qualidade {
    Q_240P {
        @Override
        public String toString() {
            return "240p";
        }
    },

    Q_360P {
        @Override
        public String toString() {
            return "360p";
        }
    },
    Q_720P {
        @Override
        public String toString() {
            return "720p";
        }
    },
    Q_1024P {
        @Override
        public String toString() {
            return "1024p";
        }
    },
}
