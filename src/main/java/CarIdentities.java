public class CarIdentities {



        private String plsignature;
        private String varId;
        private String osmId;
        private String multiplier;
        private String divider;
        private String offset;
        private String title;

        public CarIdentities()
        {

        }

        public CarIdentities(String plsignature, String varId, String osmId, String multiplier, String divider, String offset, String title)
        {
            this.plsignature = plsignature;
            this.varId = varId;
            this.osmId = osmId;
            this.multiplier = multiplier;
            this.divider = divider;
            this.offset = offset;
            this.title = title;
        }

        public String getPlsignature()
        {
            return plsignature;
        }

        public String getvarId()
        {
            return varId;
        }

        public String getOsmId()
        {
            return osmId;
        }

        public String getMultiplier()
        {
            return multiplier;
        }

        public String getDivider()
        {
            return divider;
        }

        public String getOffset()
        {
            return offset;
        }

        public void setPlsignature(String plsignature)
        {
            this.plsignature = plsignature;
        }

        public void setVarId(String varId)
        {
            this.varId = varId;
        }

        public void setOsmId(String osmId) {
            this.osmId = osmId;
        }

        public void setMultiplier(String multiplier) {
            this.multiplier = multiplier;
        }

        public void setDivider(String divider) {
            this.divider = divider;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }


}
