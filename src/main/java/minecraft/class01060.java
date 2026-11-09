package minecraft;

import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public abstract class class01060<T> extends class05151<T> {
   public static final SimpleDateFormat N = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   public static final String y = "forever";
   protected final Date L;
   protected final String u;
   @Nullable
   protected final Date i;
   @Nullable
   protected final String R;

   @Nullable
   public Date L() {
      return this.i;
   }

   @Override
   boolean M() {
      return this.i == null ? false : this.i.before(new Date());
   }

   protected class01060(@Nullable T var1, JsonObject var2) {
      super((T)var1);

      Date date;
      try {
         date = var2.has("created") ? N.parse(var2.get("created").getAsString()) : new Date();
      } catch (ParseException parseexception1) {
         date = new Date();
      }

      this.L = date;
      this.u = var2.has("source") ? var2.get("source").getAsString() : "(Unknown)";

      Date date1;
      try {
         date1 = var2.has("expires") ? N.parse(var2.get("expires").getAsString()) : null;
      } catch (ParseException parseexception) {
         date1 = null;
      }

      this.i = date1;
      this.R = var2.has("reason") ? var2.get("reason").getAsString() : null;
   }

   public class01060(@Nullable T var1, @Nullable Date var2, @Nullable String var3, @Nullable Date var4, @Nullable String var5) {
      super((T)var1);
      this.L = var2 == null ? new Date() : var2;
      this.u = var3 == null ? "(Unknown)" : var3;
      this.i = var4;
      this.R = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class01060 class01060 = (class01060)var1;
         return Objects.equals(this.u, class01060.u)
            && Objects.equals(this.i, class01060.i)
            && Objects.equals(this.R, class01060.R)
            && Objects.equals(this.B(), class01060.B());
      } else {
         return false;
      }
   }

   public class00392 i() {
      String s = this.u();
      return s == null ? class00392.L("multiplayer.disconnect.banned.reason.default") : class00392.y(s);
   }

   @Nullable
   public String u() {
      return this.R;
   }

   public String y() {
      return this.u;
   }

   public Date N() {
      return this.L;
   }

   @Override
   protected void N(JsonObject var1) {
      var1.addProperty("created", N.format(this.L));
      var1.addProperty("source", this.u);
      var1.addProperty("expires", this.i == null ? "forever" : N.format(this.i));
      var1.addProperty("reason", this.R);
   }

   public abstract class00392 R();
}
