package codegym.furama.model.services;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name="servicequeue")
public class ServiceQueue {
    //reffrence dichvu where  status:khadung

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idQueue;

    @ManyToOne
    @JoinColumn(name="id_dichvu",nullable = false,referencedColumnName = "iddichvu")
    private DichVu dichVu;

    @Column(name="timeapprove")
    private Date timeApprove;

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    @Column(name="intendTime")
    private Date intendTime;

    @Column(name="moneyDeposit")
    private Long moneyDeposit;

    public int getIdQueue() {
        return idQueue;
    }

    public void setIdQueue(int idQueue) {
        this.idQueue = idQueue;
    }

    public Date getTimeApprove() {
        return timeApprove;
    }

    public void setTimeApprove(Date timeApprove) {
        this.timeApprove = timeApprove;
    }

    public Date getIntendTime() {
        return intendTime;
    }

    public void setIntendTime(Date intendTime) {
        this.intendTime = intendTime;
    }

    public Long getMoneyDeposit() {
        return moneyDeposit;
    }

    public void setMoneyDeposit(Long moneyDeposit) {
        this.moneyDeposit = moneyDeposit;
    }

    public ServiceQueue() {
    }
}
