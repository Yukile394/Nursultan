package minecraft;

public record class03737(
   String language,
   int viewDistance,
   class08027 chatVisibility,
   boolean chatColors,
   int modelCustomisation,
   class07070 mainHand,
   boolean textFilteringEnabled,
   boolean allowsListing,
   class01315 particleStatus
) {
   public static final int N = 16;

   public int L() {
      return this.viewDistance;
   }

   public class07070 M() {
      return this.mainHand;
   }

   public class03737(class00667 var1) {
      this(
         var1.u(16),
         var1.readByte(),
         var1.y(class08027.class),
         var1.readBoolean(),
         var1.readUnsignedByte(),
         var1.y(class07070.class),
         var1.readBoolean(),
         var1.readBoolean(),
         var1.y(class01315.class)
      );
   }

   public class03737(
      String language,
      int viewDistance,
      class08027 chatVisibility,
      boolean chatColors,
      int modelCustomisation,
      class07070 mainHand,
      boolean textFilteringEnabled,
      boolean allowsListing,
      class01315 particleStatus
   ) {
      this.language = language;
      this.viewDistance = viewDistance;
      this.chatVisibility = chatVisibility;
      this.chatColors = chatColors;
      this.modelCustomisation = modelCustomisation;
      this.mainHand = mainHand;
      this.textFilteringEnabled = textFilteringEnabled;
      this.allowsListing = allowsListing;
      this.particleStatus = particleStatus;
   }

   public boolean B() {
      return this.textFilteringEnabled;
   }

   public boolean Z() {
      return this.allowsListing;
   }

   public boolean i() {
      return this.chatColors;
   }

   public class01315 z() {
      return this.particleStatus;
   }

   public class08027 u() {
      return this.chatVisibility;
   }

   public String y() {
      return this.language;
   }

   public static class03737 N() {
      return new class03737("en_us", 2, class08027.field_7538, true, 0, class08036.field_62509, false, false, class01315.field_18197);
   }

   public void N(class00667 var1) {
      var1.N(this.language);
      var1.writeByte(this.viewDistance);
      var1.N((Enum<?>)this.chatVisibility);
      var1.writeBoolean(this.chatColors);
      var1.writeByte(this.modelCustomisation);
      var1.N((Enum<?>)this.mainHand);
      var1.writeBoolean(this.textFilteringEnabled);
      var1.writeBoolean(this.allowsListing);
      var1.N((Enum<?>)this.particleStatus);
   }

   public int R() {
      return this.modelCustomisation;
   }
}
