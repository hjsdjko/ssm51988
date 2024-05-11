const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm51988/",
            name: "ssm51988",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm51988/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "微信点餐系统小程序"
        } 
    }
}
export default base
