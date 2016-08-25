package de.s3xy.architecturesample.di.component;

import dagger.Component;
import de.s3xy.architecturesample.di.ApplicationModule;
import de.s3xy.architecturesample.di.scope.ApplicationScope;
import de.s3xy.architecturesample.login.ui.LoginActivity;
import de.s3xy.architecturesample.network.NetworkModule;
import de.s3xy.architecturesample.search.ui.SearchRepositoriesActivity;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */

@ApplicationScope
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {
    void inject(SearchRepositoriesActivity searchResultActivity);
    void inject(LoginActivity loginActivity);
}
