import { HttpInterceptorFn } from "@angular/common/http";
import { environment } from "../../../environments/environment";

export const apiInterceptor: HttpInterceptorFn = (req, next) => {
    if (environment.useMock) {
        req = req.clone({
            url: req.url.replace(environment.apiUrl, environment.mockUrl),
        });
    }
    return next(req);
};
