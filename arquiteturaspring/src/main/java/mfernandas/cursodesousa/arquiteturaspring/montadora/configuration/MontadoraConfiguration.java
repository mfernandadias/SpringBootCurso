package mfernandas.cursodesousa.arquiteturaspring.montadora.configuration;


import mfernandas.cursodesousa.arquiteturaspring.montadora.Motor;
import mfernandas.cursodesousa.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration

public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Scope("singleton")
    public Motor motorASPIRADO(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Primary
    @Bean
    public Motor motorMFernanda(){
        var motor = new Motor();
        motor.setCavalos(130);
        motor.setCilindros(4);
        motor.setModelo("MG-40");
        motor.setLitragem(2.4);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }





}
