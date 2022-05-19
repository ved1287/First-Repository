export class Loan {
    constructor(
        public loanId:number,public loanCustomerName:string,
        public loanAmount:number,public dateOfLoan:string,
        public tenure:number,public rateOfInterest:number
    ){

    }

    computeInterestAmount(){
        let roi=this.rateOfInterest/100;
    var val= (1+(roi*this.tenure));
    return (this.loanAmount*val)-this.loanAmount;
    }

    computeEMI(){
        let emi=(this.loanAmount * this.rateOfInterest * (1 + this.rateOfInterest)*this.tenure/((1 + this.rateOfInterest)* this.tenure - 1));
        return emi;
    }
}