package minecraft;

import Nursultan.class10786;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jspecify.annotations.Nullable;

public class class07742 {
   private static final OpenOption[] N = new OpenOption[]{
      StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   };

   public static void L(class07709 var0, DataOutput var1) throws IOException {
      y(var0, new class10786(var1));
   }

   public static class07709 L(DataInput var0, class07726 var1) throws IOException {
      byte b0 = var0.readByte();
      if (b0 == 0) {
         return class06997.y;
      } else {
         class07707.N(var0);
         return N(var0, var1, b0);
      }
   }

   public class07742() {
      super();
   }

   public static void y(class07709 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.L());
      if (var0.L() != 0) {
         var1.writeUTF("");
         var0.N(var1);
      }
   }

   public static class07709 y(DataInput var0, class07726 var1) throws IOException {
      byte b0 = var0.readByte();
      return (class07709)(b0 == 0 ? class06997.y : N(var0, var1, b0));
   }

   public static void y(class07001 var0, Path var1) throws IOException {
      try (
         OutputStream outputstream = Files.newOutputStream(var1, N);
         BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(outputstream);
         DataOutputStream dataoutputstream = new DataOutputStream(bufferedoutputstream);
      ) {
         N(var0, (DataOutput)dataoutputstream);
      }
   }

   public static void N_83(class07709 var0, DataOutput var1) throws IOException {
      var1.writeByte(var0.L());
      if (var0.L() != 0) {
         var0.N(var1);
      }
   }

   public static void N_81(DataInput var0, class03175 var1, class07726 var2) throws IOException {
      class01424<?> class01424 = class01465.N(var0.readByte());
      if (class01424 == class06997.N) {
         if (var1.y(class06997.N) == class03154.field_36253) {
            var1.N();
         }
      } else {
         switch (var1.y(class01424)) {
            case field_36255:
            default:
               break;
            case field_36254:
               class07707.N(var0);
               class01424.y(var0, var2);
               break;
            case field_36253:
               class07707.N(var0);
               class01424.N(var0, var1, var2);
         }
      }
   }

   private static class07709 N(DataInput var0, class07726 var1, byte var2) {
      try {
         return class01465.N(var2).L(var0, var1);
      } catch (IOException ioexception) {
         class07080 class07080 = class07080.N(ioexception, "Loading NBT data");
         class07080.N("NBT Tag").N("Tag type", var2);
         throw new class03103(class07080);
      }
   }

   public static class07001 N(Path var0, class07726 var1) throws IOException {
      class07001 class07001;
      try (
         InputStream inputstream = Files.newInputStream(var0);
         class03172 class03172 = new class03172(inputstream);
      ) {
         class07001 = N_82(class03172, var1);
      }

      return class07001;
   }

   private static DataInputStream N(InputStream var0) throws IOException {
      return new DataInputStream(new class03172(new GZIPInputStream(var0)));
   }

   public static class07001 N(DataInput var0) throws IOException {
      return N(var0, class07726.L());
   }

   public static void N(class07001 var0, Path var1) throws IOException {
      try (
         OutputStream outputstream = Files.newOutputStream(var1, N);
         BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(outputstream);
      ) {
         N(var0, bufferedoutputstream);
      }
   }

   public static void N(InputStream var0, class03175 var1, class07726 var2) throws IOException {
      try (DataInputStream datainputstream = N(var0)) {
         N_81(datainputstream, var1, var2);
      }
   }

   public static void N(Path var0, class03175 var1, class07726 var2) throws IOException {
      try (
         InputStream inputstream = Files.newInputStream(var0);
         class03172 class03172 = new class03172(inputstream);
      ) {
         N(class03172, var1, var2);
      }
   }

   public static class07001 N_82(InputStream var0, class07726 var1) throws IOException {
      class07001 class07001;
      try (DataInputStream datainputstream = N(var0)) {
         class07001 = N(datainputstream, var1);
      }

      return class07001;
   }

   public static class07001 N(DataInput var0, class07726 var1) throws IOException {
      class07709 class07709 = L(var0, var1);
      if (class07709 instanceof class07001) {
         return (class07001)class07709;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   private static DataOutputStream N(OutputStream var0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(var0)));
   }

   @Nullable
   public static class07001 N(Path var0) throws IOException {
      if (!Files.exists(var0)) {
         return null;
      } else {
         class07001 class07001;
         try (
            InputStream inputstream = Files.newInputStream(var0);
            DataInputStream datainputstream = new DataInputStream(inputstream);
         ) {
            class07001 = N(datainputstream, class07726.L());
         }

         return class07001;
      }
   }

   public static void N(class07001 var0, OutputStream var1) throws IOException {
      try (DataOutputStream dataoutputstream = N(var1)) {
         N(var0, (DataOutput)dataoutputstream);
      }
   }
}
