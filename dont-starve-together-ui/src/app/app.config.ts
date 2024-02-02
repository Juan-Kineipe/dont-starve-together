import { ApplicationConfig, importProvidersFrom } from "@angular/core";
import { provideRouter } from "@angular/router";
import { provideHttpClient, withInterceptors } from "@angular/common/http";

import { routes } from "./app.routes";

import { NgxSpinnerModule } from "ngx-spinner";
import { provideAnimations } from "@angular/platform-browser/animations";
import { apiInterceptor } from "./shared/interceptors/api,interceptor";

export const appConfig: ApplicationConfig = {
    providers: [
        provideRouter(routes),
        provideHttpClient(withInterceptors([apiInterceptor])),
        importProvidersFrom(NgxSpinnerModule.forRoot()),
        provideAnimations(),
    ],
};
