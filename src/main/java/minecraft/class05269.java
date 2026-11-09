package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class05269 {
   private static final Logger N = LogUtils.getLogger();
   protected final Properties NW;

   public void L(Path var1) {
      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1, StandardCharsets.UTF_8)) {
         this.NW.store(bufferedwriter, "Minecraft server properties");
      } catch (IOException ioexception) {
         N.error("Failed to store properties to file: {}", var1);
      }
   }

   @Nullable
   protected Boolean L(String var1) {
      return (Boolean)this.N(var1, Boolean::valueOf);
   }

   public class05269(Properties var1) {
      super();
      this.NW = var1;
   }

   protected abstract class05269 y(class01042 var1, Properties var2);

   protected class05259 y(String var1, Function var2, Object var3) {
      return this.y(var1, var2, Objects::toString, var3);
   }

   @Nullable
   protected String y(String var1) {
      return (String)this.N(var1, Function.identity());
   }

   public static Properties y(Path var0) {
      try {
         try {
            Properties properties3;
            try (InputStream inputstream = Files.newInputStream(var0)) {
               CharsetDecoder charsetdecoder = StandardCharsets.UTF_8
                  .newDecoder()
                  .onMalformedInput(CodingErrorAction.REPORT)
                  .onUnmappableCharacter(CodingErrorAction.REPORT);
               Properties properties2 = new Properties();
               properties2.load(new InputStreamReader(inputstream, charsetdecoder));
               properties3 = properties2;
            }

            return properties3;
         } catch (CharacterCodingException charactercodingexception) {
            N.info("Failed to load properties as UTF-8 from file {}, trying ISO_8859_1", var0);

            Properties properties1;
            try (BufferedReader bufferedreader = Files.newBufferedReader(var0, StandardCharsets.ISO_8859_1)) {
               Properties properties = new Properties();
               properties.load(bufferedreader);
               properties1 = properties;
            }

            return properties1;
         }
      } catch (IOException ioexception) {
         N.error("Failed to load properties from file: {}", var0, ioexception);
         return new Properties();
      }
   }

   protected class05259 y(String var1, int var2) {
      return this.y(var1, N(Integer::parseInt), var2);
   }

   protected class05259 y(String var1, boolean var2) {
      return this.y(var1, Boolean::valueOf, var2);
   }

   protected class05259 y(String var1, Function var2, Function var3, Object var4) {
      String s = this.N(var1);
      Object object = MoreObjects.firstNonNull(s != null ? var2.apply(s) : null, var4);
      this.NW.put(var1, var3.apply(object));
      return new class05259(this, var1, object, var3);
   }

   protected class05259 y(String var1, String var2) {
      return this.y(var1, String::new, var2);
   }

   protected int N(String var1, int var2) {
      return (Integer)this.N(var1, N(Integer::parseInt), Integer.valueOf(var2));
   }

   protected boolean N(String var1, boolean var2) {
      return (Boolean)this.N(var1, Boolean::valueOf, var2);
   }

   protected long N(String var1, long var2) {
      return (Long)this.N(var1, N(Long::parseLong), var2);
   }

   protected Properties N() {
      Properties properties = new Properties();
      properties.putAll(this.NW);
      return properties;
   }

   protected Object N(String var1, Function var2, Object var3) {
      return this.N(var1, var2, Objects::toString, var3);
   }

   protected Object N(String var1, Function var2, UnaryOperator var3, Function var4, Object var5) {
      return this.N(var1, var2x -> {
         Object object = var2.apply(var2x);
         return object != null ? var3.apply(object) : null;
      }, var4, var5);
   }

   protected Object N(String var1, Function var2, Function var3, Object var4) {
      String s = this.N(var1);
      Object object = MoreObjects.firstNonNull(s != null ? var2.apply(s) : null, var4);
      this.NW.put(var1, var3.apply(object));
      return object;
   }

   @Nullable
   protected Object N(String var1, Function var2) {
      String s = this.N(var1);
      if (s == null) {
         return null;
      } else {
         this.NW.remove(var1);
         return var2.apply(s);
      }
   }

   @Nullable
   private String N(String var1) {
      return (String)this.NW.get(var1);
   }

   protected int N(String var1, UnaryOperator var2, int var3) {
      return (Integer)this.N(var1, N(Integer::parseInt), var2, Objects::toString, var3);
   }

   protected static Function N(IntFunction var0, Function var1) {
      return var2 -> {
         try {
            return var0.apply(Integer.parseInt(var2));
         } catch (NumberFormatException numberformatexception) {
            return var1.apply(var2);
         }
      };
   }

   private static Function N(Function var0) {
      return var1 -> {
         try {
            return (Number)var0.apply(var1);
         } catch (NumberFormatException numberformatexception) {
            return null;
         }
      };
   }

   protected String N(String var1, String var2) {
      return (String)this.N(var1, Function.identity(), Function.identity(), var2);
   }
}
