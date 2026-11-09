package minecraft;

import org.jspecify.annotations.Nullable;

public record class01164(class07049 sourceEntity, class00500 affectedState) {
   public class01164(@Nullable class07049 sourceEntity, @Nullable class00500 affectedState) {
      this.sourceEntity = sourceEntity;
      this.affectedState = affectedState;
   }

   @Nullable
   public class00500 y() {
      return this.affectedState;
   }

   public static class01164 N(@Nullable class07049 var0, @Nullable class00500 var1) {
      return new class01164(var0, var1);
   }

   @Nullable
   public class07049 N() {
      return this.sourceEntity;
   }

   public static class01164 N(@Nullable class07049 var0) {
      return new class01164(var0, null);
   }

   public static class01164 N(@Nullable class00500 var0) {
      return new class01164(null, var0);
   }
}
