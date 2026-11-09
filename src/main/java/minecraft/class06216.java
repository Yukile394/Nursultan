package minecraft;

public record class06216(class05111 realmsClient, class01040 quickPlayData) {

   public class06216(class05111 realmsClient, class01040 quickPlayData) {
      this.realmsClient = realmsClient;
      this.quickPlayData = quickPlayData;
   }

   public class01040 y() {
      return this.quickPlayData;
   }

   public class05111 N() {
      return this.realmsClient;
   }
}
