public class BookVo extends Book{

        private  String typeName;

        public String getTypeName() {
                return typeName;
        }

        public void setTypeName(String typeName) {
                this.typeName = typeName;
        }

        @Override
        public String toString() {
                return "BookVo{" +
                        "typeName='" + typeName + '\'' +
                        "} " + super.toString();
        }
}
