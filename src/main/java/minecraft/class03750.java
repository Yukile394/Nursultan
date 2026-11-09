package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.minecraft.report.ReportedEntity;
import com.mojang.datafixers.util.Either;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03750 extends class02073<class03744> {
   @Nullable
   @Override
   public class02043 L() {
      if (this.N.R == null) {
         return class02043.N;
      } else {
         return this.N.i.length() > this.y.maxOpinionCommentsLength() ? class02043.u : super.L();
      }
   }

   public class03750(UUID var1, Supplier<class01631> var2, AbuseReportLimits var3) {
      super(new class03744(UUID.randomUUID(), Instant.now(), var1, var2), var3);
   }

   public class03750(class03744 var1, AbuseReportLimits var2) {
      super(var1, var2);
   }

   @Override
   public boolean y() {
      return StringUtils.isNotEmpty(this.M()) || this.Z() != null;
   }

   @Override
   public Either<class02044, class02043> N(class03409 var1) {
      class02043 class02043 = this.L();
      if (class02043 != null) {
         return Either.right(class02043);
      } else {
         String s = Objects.requireNonNull(this.N.R).N();
         ReportedEntity reportedentity = new ReportedEntity(this.N.u);
         String s1 = this.N.N.get().N() instanceof class06974 class06974 ? class06974.L() : null;
         AbuseReport abusereport = AbuseReport.skin(this.N.i, s, s1, reportedentity, this.N.L);
         return Either.left(new class02044(this.N.y, class03752.field_46065, abusereport));
      }
   }
}
