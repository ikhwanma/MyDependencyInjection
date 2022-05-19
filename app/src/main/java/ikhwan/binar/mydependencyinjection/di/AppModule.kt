package ikhwan.binar.mydependencyinjection.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ikhwan.binar.mydependencyinjection.Student
import ikhwan.binar.mydependencyinjection.latihansatu.Nilai
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun student(): Student {
        return Student()
    }

    @Singleton
    @Provides
    fun nilai(): Nilai {
        return Nilai()
    }

    @Singleton
    @Provides
    fun teacherName():String{
        return "Ikhwanm"
    }

}