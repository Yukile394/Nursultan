package minecraft;

public record class00465(class07209 pos, class03556<class05369> poiType, int freeTicketCount) {
   public static final class02362<class04247, class00465> N = class02362.N(
      class07209.field_48404, class00465::N, class02389.y(class04227.NZ), class00465::y, class02389.B, class00465::L, class00465::new
   );

   public int L() {
      return this.freeTicketCount;
   }

   public class00465(class05377 var1) {
      this(var1.M(), var1.B(), var1.y());
   }

   public class00465(class07209 pos, class03556<class05369> poiType, int freeTicketCount) {
      super();
      this.pos = pos;
      this.poiType = poiType;
      this.freeTicketCount = freeTicketCount;
   }

   public class03556<class05369> y() {
      return this.poiType;
   }

   public class07209 N() {
      return this.pos;
   }
}
