package minecraft;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.TimeZone;
import com.ibm.icu.util.ULocale;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.jspecify.annotations.Nullable;

public class class08351 implements class00372<String> {
   public static final String N = "";
   private static final long u = TimeUnit.SECONDS.toMillis(1L);
   public static final Codec<String> y = Codec.STRING;
   private static final Codec<TimeZone> i = y.comapFlatMap(var0 -> {
      TimeZone timezone = TimeZone.getTimeZone(var0);
      return timezone.equals(TimeZone.UNKNOWN_ZONE) ? DataResult.error(() -> "Unknown timezone: " + var0) : DataResult.success(timezone);
   }, TimeZone::getID);
   private static final MapCodec<class08340> R = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.STRING.fieldOf("pattern").forGetter(var0x -> var0x.N()),
            Codec.STRING.optionalFieldOf("locale", "").forGetter(var0x -> var0x.y()),
            i.optionalFieldOf("time_zone").forGetter(var0x -> var0x.L())
         )
         .apply(var0, class08340::new)
   );
   public static final class00336<class08351, String> L = class00336.N(R.flatXmap(class08351::N, var0 -> DataResult.success(var0.M)), y);
   private final class08340 M;
   private final DateFormat B;
   private long Z;
   private String z = "";

   private String L() {
      return this.B.format(new Date());
   }

   private class08351(class08340 var1, DateFormat var2) {
      super();
      this.M = var1;
      this.B = var2;
   }

   @Override
   public Codec<String> y() {
      return y;
   }

   private static DataResult<class08351> N(class08340 var0) {
      ULocale ulocale = new ULocale(var0.y());
      Calendar calendar = var0.L().map(var1x -> Calendar.getInstance(var1x, ulocale)).orElseGet(() -> Calendar.getInstance(ulocale));
      SimpleDateFormat simpledateformat = new SimpleDateFormat(var0.N(), ulocale);
      simpledateformat.setCalendar(calendar);

      try {
         simpledateformat.format(new Date());
      } catch (Exception exception) {
         return DataResult.error(() -> "Invalid time format '" + simpledateformat + "': " + exception.getMessage());
      }

      return DataResult.success(new class08351(var0, simpledateformat));
   }

   public static class08351 N(String var0, String var1, Optional<TimeZone> var2) {
      return (class08351)N(new class08340(var0, var1, var2)).getOrThrow(var0x -> new IllegalStateException("Failed to validate format: " + var0x));
   }

   @Override
   public class00336<class08351, String> N() {
      return L;
   }

   @Nullable
   public String y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      long ix = class07536.L();
      if (ix > this.Z) {
         this.z = this.L();
         this.Z = ix + u;
      }

      return this.z;
   }
}
