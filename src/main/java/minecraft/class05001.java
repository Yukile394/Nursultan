package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.Strictness;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class05001 {
   private static final Gson N = new GsonBuilder().create();

   public static boolean L(JsonObject var0, String var1) {
      return !R(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isBoolean();
   }

   public static boolean L(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isBoolean();
   }

   public static boolean L(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsBoolean();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Boolean, was " + u(var0));
      }
   }

   public static boolean M(@Nullable JsonObject var0, String var1) {
      return var0 == null ? false : var0.get(var1) != null;
   }

   public static int M(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsInt();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Int, was " + u(var0));
      }
   }

   public static int P(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return M(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Int");
      }
   }

   public static char T(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return Z(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Character");
      }
   }

   public class05001() {
      super();
   }

   public static JsonElement B(JsonObject var0, String var1) {
      JsonElement jsonelement = var0.get(var1);
      if (jsonelement != null && !jsonelement.isJsonNull()) {
         return jsonelement;
      } else {
         throw new JsonSyntaxException("Missing field " + var1);
      }
   }

   public static byte B(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsByte();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Byte, was " + u(var0));
      }
   }

   public static String Z(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return N(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a string");
      }
   }

   public static char Z(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsCharacter();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Character, was " + u(var0));
      }
   }

   public static float i(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsFloat();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Float, was " + u(var0));
      }
   }

   public static String i(JsonElement var0) {
      StringWriter stringwriter = new StringWriter();
      JsonWriter jsonwriter = new JsonWriter(stringwriter);

      try {
         N(jsonwriter, var0, Comparator.naturalOrder());
      } catch (IOException ioexception) {
         throw new AssertionError(ioexception);
      }

      return stringwriter.toString();
   }

   public static boolean i(JsonObject var0, String var1) {
      return !M(var0, var1) ? false : var0.get(var1).isJsonObject();
   }

   public static BigDecimal b(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return z(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a BigDecimal");
      }
   }

   public static byte s(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return B(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Byte");
      }
   }

   public static JsonObject n(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return W(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonObject");
      }
   }

   public static long m(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return R(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Long");
      }
   }

   public static JsonArray m(JsonElement var0, String var1) {
      if (var0.isJsonArray()) {
         return var0.getAsJsonArray();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonArray, was " + u(var0));
      }
   }

   public static JsonArray t(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return m(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a JsonArray");
      }
   }

   public static short v(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return E(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Short");
      }
   }

   public static BigInteger j(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return U(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a BigInteger");
      }
   }

   public static BigInteger U(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsBigInteger();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a BigInteger, was " + u(var0));
      }
   }

   public static boolean U(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return L(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Boolean");
      }
   }

   public static BigDecimal z(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsBigDecimal();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a BigDecimal, was " + u(var0));
      }
   }

   public static class03556<class06581> z(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return y(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find an item");
      }
   }

   public static double u(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsDouble();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Double, was " + u(var0));
      }
   }

   public static String u(@Nullable JsonElement var0) {
      String s = StringUtils.abbreviateMiddle(String.valueOf(var0), "...", 10);
      if (var0 == null) {
         return "null (missing)";
      } else if (var0.isJsonNull()) {
         return "null (json)";
      } else if (var0.isJsonArray()) {
         return "an array (" + s + ")";
      } else if (var0.isJsonObject()) {
         return "an object (" + s + ")";
      } else {
         if (var0.isJsonPrimitive()) {
            JsonPrimitive jsonprimitive = var0.getAsJsonPrimitive();
            if (jsonprimitive.isNumber()) {
               return "a number (" + s + ")";
            }

            if (jsonprimitive.isBoolean()) {
               return "a boolean (" + s + ")";
            }
         }

         return s;
      }
   }

   public static boolean u(JsonObject var0, String var1) {
      return !M(var0, var1) ? false : var0.get(var1).isJsonArray();
   }

   public static class03556<class06581> y(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         String s = var0.getAsString();
         return class04206.B
            .L(class01894.N(s))
            .orElseThrow(() -> new JsonSyntaxException("Expected " + var1 + " to be an item, was unknown string '" + s + "'"));
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be an item, was " + u(var0));
      }
   }

   public static boolean y(JsonObject var0, String var1) {
      return !R(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isNumber();
   }

   public static <T> T y(Gson var0, Reader var1, TypeToken<T> var2) {
      Object object = N(var0, var1, var2);
      if (object == null) {
         throw new JsonParseException("JSON data was null or empty");
      } else {
         return (T)object;
      }
   }

   public static JsonArray y(Reader var0) {
      return N(N, var0, JsonArray.class);
   }

   public static JsonArray y(String var0) {
      return y(new StringReader(var0));
   }

   public static boolean y(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isNumber();
   }

   public static short E(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsShort();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Short, was " + u(var0));
      }
   }

   public static double E(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return u(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Double");
      }
   }

   public static boolean N(JsonElement var0, int var1) {
      try {
         Streams.write(var0, new JsonWriter(Streams.writerForAppendable(new class05032(var1))));
         return false;
      } catch (IllegalStateException illegalstateexception) {
         return true;
      } catch (IOException ioexception) {
         throw new UncheckedIOException(ioexception);
      }
   }

   public static <T> T N(@Nullable JsonElement var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0 != null) {
         return (T)var2.deserialize(var0, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static <T> T N(JsonObject var0, String var1, JsonDeserializationContext var2, Class<? extends T> var3) {
      if (var0.has(var1)) {
         return N(var0.get(var1), var1, var2, var3);
      } else {
         throw new JsonSyntaxException("Missing " + var1);
      }
   }

   public static void N(JsonWriter var0, @Nullable JsonElement var1, @Nullable Comparator<String> var2) throws IOException {
      if (var1 == null || var1.isJsonNull()) {
         var0.nullValue();
      } else if (var1.isJsonPrimitive()) {
         JsonPrimitive jsonprimitive = var1.getAsJsonPrimitive();
         if (jsonprimitive.isNumber()) {
            var0.value(jsonprimitive.getAsNumber());
         } else if (jsonprimitive.isBoolean()) {
            var0.value(jsonprimitive.getAsBoolean());
         } else {
            var0.value(jsonprimitive.getAsString());
         }
      } else if (var1.isJsonArray()) {
         var0.beginArray();

         for (JsonElement jsonelement : var1.getAsJsonArray()) {
            N(var0, jsonelement, var2);
         }

         var0.endArray();
      } else {
         if (!var1.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + var1.getClass());
         }

         var0.beginObject();

         for (Entry entry : N(var1.getAsJsonObject().entrySet(), var2)) {
            var0.name((String)entry.getKey());
            N(var0, (JsonElement)entry.getValue(), var2);
         }

         var0.endObject();
      }
   }

   @Nullable
   public static JsonArray N(JsonObject var0, String var1, @Nullable JsonArray var2) {
      return var0.has(var1) ? m(var0.get(var1), var1) : var2;
   }

   @Nullable
   public static <T> T N(Gson var0, Reader var1, TypeToken<T> var2) {
      try {
         JsonReader jsonreader = new JsonReader(var1);
         jsonreader.setStrictness(Strictness.STRICT);
         return (T)var0.getAdapter(var2).read(jsonreader);
      } catch (IOException ioexception) {
         throw new JsonParseException(ioexception);
      }
   }

   public static <T> T N(Gson var0, String var1, Class<T> var2) {
      return N(var0, new StringReader(var1), var2);
   }

   private static Collection<Entry<String, JsonElement>> N(Collection<Entry<String, JsonElement>> var0, @Nullable Comparator<String> var1) {
      if (var1 == null) {
         return var0;
      } else {
         ArrayList arraylist = new ArrayList(var0);
         arraylist.sort(Entry.comparingByKey(var1));
         return arraylist;
      }
   }

   @Nullable
   public static <T> T N(Gson var0, String var1, TypeToken<T> var2) {
      return N(var0, new StringReader(var1), var2);
   }

   public static <T> T N(Gson var0, Reader var1, Class<T> var2) {
      try {
         JsonReader jsonreader = new JsonReader(var1);
         jsonreader.setStrictness(Strictness.STRICT);
         Object object = var0.getAdapter(var2).read(jsonreader);
         if (object == null) {
            throw new JsonParseException("JSON data was null or empty");
         } else {
            return (T)object;
         }
      } catch (IOException ioexception) {
         throw new JsonParseException(ioexception);
      }
   }

   public static JsonObject N(String var0) {
      return N(new StringReader(var0));
   }

   @Nullable
   public static <T> T N(JsonObject var0, String var1, @Nullable T var2, JsonDeserializationContext var3, Class<? extends T> var4) {
      return (T)(var0.has(var1) ? N(var0.get(var1), var1, var3, var4) : var2);
   }

   public static JsonObject N(Reader var0) {
      return N(N, var0, JsonObject.class);
   }

   public static double N(JsonObject var0, String var1, double var2) {
      return var0.has(var1) ? u(var0.get(var1), var1) : var2;
   }

   public static float N(JsonObject var0, String var1, float var2) {
      return var0.has(var1) ? i(var0.get(var1), var1) : var2;
   }

   public static long N(JsonObject var0, String var1, long var2) {
      return var0.has(var1) ? R(var0.get(var1), var1) : var2;
   }

   public static int N(JsonObject var0, String var1, int var2) {
      return var0.has(var1) ? M(var0.get(var1), var1) : var2;
   }

   public static byte N(JsonObject var0, String var1, byte var2) {
      return var0.has(var1) ? B(var0.get(var1), var1) : var2;
   }

   public static String N(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive()) {
         return var0.getAsString();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a string, was " + u(var0));
      }
   }

   @Nullable
   public static String N(JsonObject var0, String var1, @Nullable String var2) {
      return var0.has(var1) ? N(var0.get(var1), var1) : var2;
   }

   @Nullable
   public static class03556<class06581> N(JsonObject var0, String var1, @Nullable class03556<class06581> var2) {
      return var0.has(var1) ? y(var0.get(var1), var1) : var2;
   }

   public static boolean N(JsonObject var0, String var1, boolean var2) {
      return var0.has(var1) ? L(var0.get(var1), var1) : var2;
   }

   public static BigDecimal N(JsonObject var0, String var1, BigDecimal var2) {
      return var0.has(var1) ? z(var0.get(var1), var1) : var2;
   }

   public static BigInteger N(JsonObject var0, String var1, BigInteger var2) {
      return var0.has(var1) ? U(var0.get(var1), var1) : var2;
   }

   public static short N(JsonObject var0, String var1, short var2) {
      return var0.has(var1) ? E(var0.get(var1), var1) : var2;
   }

   @Nullable
   public static JsonObject N(JsonObject var0, String var1, @Nullable JsonObject var2) {
      return var0.has(var1) ? W(var0.get(var1), var1) : var2;
   }

   public static boolean N(JsonElement var0) {
      return !var0.isJsonPrimitive() ? false : var0.getAsJsonPrimitive().isString();
   }

   public static char N(JsonObject var0, String var1, char var2) {
      return var0.has(var1) ? Z(var0.get(var1), var1) : var2;
   }

   public static boolean N(JsonObject var0, String var1) {
      return !R(var0, var1) ? false : var0.getAsJsonPrimitive(var1).isString();
   }

   public static JsonObject W(JsonElement var0, String var1) {
      if (var0.isJsonObject()) {
         return var0.getAsJsonObject();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a JsonObject, was " + u(var0));
      }
   }

   public static float W(JsonObject var0, String var1) {
      if (var0.has(var1)) {
         return i(var0.get(var1), var1);
      } else {
         throw new JsonSyntaxException("Missing " + var1 + ", expected to find a Float");
      }
   }

   public static long R(JsonElement var0, String var1) {
      if (var0.isJsonPrimitive() && var0.getAsJsonPrimitive().isNumber()) {
         return var0.getAsLong();
      } else {
         throw new JsonSyntaxException("Expected " + var1 + " to be a Long, was " + u(var0));
      }
   }

   public static boolean R(JsonObject var0, String var1) {
      return !M(var0, var1) ? false : var0.get(var1).isJsonPrimitive();
   }
}
