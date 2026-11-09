package minecraft;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public record class04469(byte[] N) {
   private static String[] L;
   public static Object y_0;
   public static Object y_1;

   public ByteBuffer L() {
      return ByteBuffer.wrap(this.N);
   }

   private static void M() {
      L = new String[2];
      L[0] = "Invalid message signature size";
      L[1] = "<no signature>";
   }

   public class04469(byte[] N) {
      super();
      Preconditions.checkState(N.length == 256, L[0]);
      this.N = N;
   }

   static {
      M();
      u();
      Function function = class04469::new;
      y_0 = class06338.d.xmap(function, class04469::y);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class04469 class04469 && Arrays.equals(this.N, class04469.N);
   }

   @Override
   public String toString() {
      return Base64.getEncoder().encodeToString(this.N);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.N);
   }

   private static void u() {
      y_1 = 256;
   }

   public byte[] y() {
      return this.N;
   }

   public class03928 N(class03397 var1) {
      int i = var1.N(this);
      return i != -1 ? new class03928(i) : new class03928(this);
   }

   public static String N(@Nullable class04469 var0) {
      return var0 == null ? L[1] : var0.toString();
   }

   public static void N(class00667 var0, class04469 var1) {
      var0.writeBytes(var1.N);
   }

   public int N() {
      return Arrays.hashCode(this.N);
   }

   public boolean N(class03962 var1, class03959 var2) {
      return var1.validate(var2, this.N);
   }

   public static class04469 N(class00667 var0) {
      byte[] abyte = new byte[256];
      var0.readBytes(abyte);
      return new class04469(abyte);
   }
}
